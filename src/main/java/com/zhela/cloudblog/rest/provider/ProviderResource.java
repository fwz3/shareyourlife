package com.zhela.cloudblog.rest.provider;

import java.io.File;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;
import com.zhela.cloudblog.model.users.ProviderUser;
import com.zhela.cloudblog.rest.BaseResource;
import com.zhela.cloudblog.rest.model.RESTInternalUser;
import com.zhela.cloudblog.rest.model.RESTResponse;
import com.zhela.cloudblog.service.internaluser.InternalUserService;
import com.zhela.cloudblog.service.provider.ProviderService;
import com.zhela.cloudblog.service.tweet.TweetService;
import com.zhela.cloudblog.util.CommonMethod;
import com.zhela.cloudblog.util.ModeConvert;
@Path("/providers")
public class ProviderResource extends BaseResource{

	/**
	 * 
	 * @return all the providers
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/")
	public Response getProviders() {
		try{
			return genOK(ModeConvert.ProvidersListToREST(0, -1, providerService.selectAllProviders()));
		}catch(Exception e){
			e.printStackTrace();
			return RESPONSE_SERVICE_UNAVAILABLE;
		}
	}
	
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}")
	public Response deleteProviderAccount(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount){
		try{
			RESTInternalUser restiu = (RESTInternalUser)getSession(SESSION_USER);
			int size = internalUserService.delProviderUser(providerId, restiu.getAccount(), providerAccount);
			if(size>0){
				saveSession(SESSION_PROVIDERACCOUNT,internalUserService.getProviderAccount(restiu.getAccount()));
				return genOK(new RESTResponse(Status.OK,"Success"));
			}else{
				return genOK(new RESTResponse(Status.NOT_FOUND,"Fail"));
			}
		}catch(Exception e){
			return RESPONSE_SERVICE_UNAVAILABLE;
		}
	}
	
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/{status}")
	public Response updateProviderAccountStatus(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("status") int status){
		try{
			RESTInternalUser restiu = (RESTInternalUser)getSession(SESSION_USER);
			if(internalUserService.updateProviderUser(providerId, restiu.getAccount(), providerAccount, status, null, null)!=null){
				saveSession(SESSION_PROVIDERACCOUNT,internalUserService.getProviderAccount(restiu.getAccount()));
				return genOK(new RESTResponse(Status.OK,"Success"));
			}else{
				return genOK(new RESTResponse(Status.NOT_FOUND,"Fail"));
			}
			
		}catch(Exception e){
			return RESPONSE_SERVICE_UNAVAILABLE;
		}
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/{providerPassword}")
	/**
	 * Post provide user to system.
	 */
	public Response postProviderAccount(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("providerPassword") String providerPassword){
		try{
			RESTInternalUser restiu = (RESTInternalUser)getSession(SESSION_USER);
			internalUserService.updateProviderUser(providerId, restiu.getAccount(),providerAccount, ProviderUser.STATUS_OK, providerAccount, providerPassword);
			saveSession(SESSION_PROVIDERACCOUNT,internalUserService.getProviderAccount(restiu.getAccount()));
			return genOK(new RESTResponse(Status.OK,"Success"));
		}catch(Exception e){
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	
	
	//tweet content start, /{providerId}/{providerAccount}/tweets/content
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/tweets/content/hometweet")
	/**
	 * get Home Twitter.
	 */
	public Response getHomeTweet(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@DefaultValue("20") @QueryParam("s") int size,
			@DefaultValue("-1") @QueryParam("p") long position,
			@DefaultValue("1") @QueryParam("d") int direction){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.selectHomeTweetByProvider(position, direction, size, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/tweets/content/usertweet/{userId}")
	/**
	 * get Home Twitter.
	 */
	public Response getUserTweet(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("userId") String userId,
			@DefaultValue("20") @QueryParam("s") int size,
			@DefaultValue("-1") @QueryParam("p") long position,
			@DefaultValue("1") @QueryParam("d") int direction){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.selectUserTweetByProvider(userId,position, direction, size, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/tweets/content/{tweetId}")
	/**
	 * get Twitter by ID.
	 */
	public Response getTweet(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("tweetId") String tweetId){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.selectTweet(tweetId, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/tweets/content/{tweetId}")
	/**
	 * Delete Twitter by ID.
	 */
	public Response deleteTweet(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("tweetId") String tweetId){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			boolean result = tweetService.deleteTweet(tweetId, pu);
			if(result){
				return genOK(new RESTResponse(Status.OK,"Success"));
			}else{
				return genOK(new RESTResponse(Status.CONFLICT,"fail"));
			}			
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@SuppressWarnings("deprecation")
	@Path("/{providerId}/{providerAccount}/tweets/content")
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response postTweet(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@FormDataParam("text") String text,
			@FormDataParam("latitude") Double latitude,
			@FormDataParam("longitude") Double longitude,
			@FormDataParam("replyTweetId") Long replyTweetId,
			@FormDataParam("attachmentFile") InputStream attachmentFile,
			@FormDataParam("attachmentFile") FormDataContentDisposition dispostion){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			if(dispostion!=null){
				CommonMethod commonmethod = CommonMethod.getInstance();
				String fileName = dispostion.getFileName();
				int index = fileName.lastIndexOf(".");
				String extType = "";
				if(index>0){
					extType = fileName.substring(index+1);
					extType = extType.toLowerCase();
				}
				String rootpath =  servletRequest.getRealPath("/");
				String path = commonmethod.saveImg(attachmentFile,rootpath, "/upload/tweet/tmp", extType);
				File _file = new File(rootpath+path);
				Response response =  genOK(tweetService.publishTweet(text, pu, _file));
				commonmethod.deleteFile(rootpath+path);
				return response;
				
			}else{
				return genOK(tweetService.publishTweet(text, pu, latitude, longitude, replyTweetId));
			}
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	//User relation start,/{providerId}/{providerAccount}/relations
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/relations/follow")
	/**
	 * get user's follow list.
	 */
	public Response getUserFollows(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@DefaultValue("20") @QueryParam("s") int size,
			@DefaultValue("-1") @QueryParam("p") long position){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.getFollows(position, size, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/relations/friend")
	/**
	 * get user's friends list.
	 */
	public Response getUserFriends(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@DefaultValue("20") @QueryParam("s") int size,
			@DefaultValue("-1") @QueryParam("p") long position){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.getFirends(position, size, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/relations/follow/")
	/**
	 * get user's follow list.
	 */
	public Response postUserFollows(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@QueryParam("userId") String userId,
			@QueryParam("type") Boolean type){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.followUser(userId, type, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	// Message Start,/{providerId}/{providerAccount}/messages/
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/messages/{msgId}")
	/**
	 * Delete message by ID.
	 */
	public Response deleteMessage(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("msgId") String msgId){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			boolean result = tweetService.delMessage(msgId, pu);
			if(result){
				return genOK(new RESTResponse(Status.OK,"Success"));
			}else{
				return genOK(new RESTResponse(Status.CONFLICT,"fail"));
			}			
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/messages/inbox")
	/**
	 * get inbox
	 */
	public Response getMessageInbox(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@DefaultValue("20") @QueryParam("s") int size,
			@DefaultValue("-1") @QueryParam("p") long position){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.getMessageInbox(position, size, pu));		
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/messages/outbox")
	/**
	 * get outbox
	 */
	public Response getMessageOutbox(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@DefaultValue("20") @QueryParam("s") int size,
			@DefaultValue("-1") @QueryParam("p") long position){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.getMessageOutbox(position, size, pu));		
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/messages/{userId}/{messageText}")
	public Response postMessage(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("userId") String userId,
			@PathParam("messageText") String messageText){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.sendMessage(userId, messageText, pu));		
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	//mentions start, /{providerId}/{providerAccount}/mentions
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/mentions")
	/**
	 * get mentions
	 */
	public Response getMentions(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@DefaultValue("20") @QueryParam("s") int size,
			@DefaultValue("-1") @QueryParam("p") long position,
			@DefaultValue("1") @QueryParam("p") int direction){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.getMentions(position, direction, size, pu));		
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	//counts start,/{providerId}/{providerAccount}/counts
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/counts")
	/**
	 * get counts
	 */
	public Response getCounts(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.getUnread(pu));		
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/counts/{type}")
	/**
	 * get counts
	 */
	public Response updateCounts(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("type") String type){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.resetCounts(type, pu));		
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	
	//comment start,/{providerId}/{providerAccount}/tweets/{tweetId}/comments/
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/tweets/{tweetId}/comments/{commentId}")
	/**
	 * get mentions
	 */
	public Response deleteComment(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("commentId") String commentId){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			boolean result = tweetService.deleteTweetComment(commentId,pu);	
			if(result){
				return genOK(new RESTResponse(Status.OK,"Success"));
			}else{
				return genOK(new RESTResponse(Status.CONFLICT,"fail"));
			}	
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/tweets/{tweetId}/comments")
	/**
	 * get comment by tweet
	 */
	public Response getComment(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("tweetId") String tweetId){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.getTweetComment(tweetId, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XHTML_XML})
	@Path("/{providerId}/{providerAccount}/tweets/{tweetId}/comments")
	/**
	 * post comment
	 */
	public Response postComment(@PathParam("providerId") long providerId,
			@PathParam("providerAccount") String providerAccount,
			@PathParam("tweetId") String tweetId,
			@DefaultValue("commentId") String commentId,
			@DefaultValue("text") String text){
		try{
			ProviderUser pu = getProviderUserByAccount(providerId,providerAccount);
			return genOK(tweetService.commentTweet(tweetId, commentId, text, pu));
		}catch(Exception e){
			e.printStackTrace();
			return genNotAcceptable(new RESTResponse(Status.NOT_ACCEPTABLE,e.getMessage()));
		}
	}
	
	
	
	
	private ProviderService providerService;
	private InternalUserService internalUserService;
	private TweetService tweetService;
	public void setInternalUserService(InternalUserService internalUserService) {
		this.internalUserService = internalUserService;
	}
	public void setProviderService(ProviderService providerService) {
		this.providerService = providerService;
	}
	public void setTweetService(TweetService tweetService) {
		this.tweetService = tweetService;
	}
	
}
