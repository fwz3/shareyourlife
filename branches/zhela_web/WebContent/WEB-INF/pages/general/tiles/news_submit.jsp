<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script type="text/javascript" src="/scripts/xheditor-zh-cn.js"></script>
<script>
$(document).ready(function(){
	$('#news_review').xheditor(true);
	$('#news_content').xheditor(true);
})
</script>
        	<div class="rule">
            	<div class="thank_submit">感谢您投递打折信息给<a href="#" class="zhelazhela">这啦折啦</a></div>
                <ul>
                	<li class="intro">为了更好的保证信息的完整性，我们建议您在投递前了解以下信息：</li>
                    <li>1. 请简明扼要地将您所要报道的事物叙述完整.并附上相关资源,文档,为大家送上更易阅读的信息.</li>
                    <li>2. 如消息为转载,请尽量注明文章来源.无主稿件可能会被暂缓发表. </li>
                    <li>3. 欢迎原创. 您的独家报料与独特视角是<a href="#" class="zhelazhela">这啦折啦</a>编辑与访客的宝贵财富.</li>
                    <li>4. 别忘了署名! 写上您的blog地址, 带来意想不到的人气, 也可能发现志同道合的<a href="#" class="zhelazhela">这啦折啦</a>访客.</li>
                    <li>5. 编辑也许会对投递进行适当修改, 以适合在本站发表.</li>
                </ul>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">标题:</div>
                    <input type="text" class="w200" name="title" />
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>最多20个字，简明扼要。</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">折扣开始时间:</div>
                    <input type="text" class="w100" name="title" />
                    <div class="label">结束时间</div>
                    <input type="text" class="w100" name="title" />
                     <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>请注明折扣开始时间和结束时间。</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">新闻来源:</div>
                    <input type="text" class="w300" name="title" />
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>请提供新闻来源的网址或者其他信息。</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">您的网名:</div>
                    <input type="text" class="w200" name="title" />
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>如果信息发布，会显示您的大名。</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">您的主页:</div>
                    <input type="text" class="w300" name="title" />
                    <div class="error">错误信息</div>
                </div>
                <div class="notice">请提供您的博客网址或者个人站点地址，可能能给您带来流量。</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">您的邮箱:</div>
                    <input type="text" class="w200" name="title" />
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>请留下您的邮箱作为联系方式。</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">打折商家:</div>
                    <select>
                    	<option value="1">请选择打折的商家</option>
                        <option value="2">淘宝商城</option>
                        <option value="3">其他(我们会为您补充)</option>
                    </select>
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>请选择打折信息中提供打折的商家,如果选项中没有您可以选择【其他】，我们会为您补充完整。</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">打折地区:</div>
                    <select>
                    	<option value="1">中国地区</option>
                        <option value="2">四川省</option>
                        <option value="3">云南省</option>
                        <option value="3">山东省</option>
                    </select>
                    <select>
                    	<option value="1">全部地区</option>
                    	<option value="1">成都市</option>
                        <option value="2">绵阳市</option>
                        <option value="3">自贡市</option>
                    </select>
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>打折设计的范围，请根据需要选择</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">商品类别:</div>
                    <select>
                    	<option value="1">各种类别</option>
                        <option value="2">电子产品</option>
                        <option value="3">服装</option>
                        <option value="3">食品</option>
                    </select>
                    <input type="button" class="w60" value="增加" />
                    <div class="error">错误信息</div>
                </div>
                <div class="option_link"><a class="b_link" href="#">电子产品</a> <a class="b_link" href="#">服装</a></div>
                <div class="notice"><em>(必填*)</em>打折产品的类别，可以包含多种，请增加，如果类别实在太多，请选择【各种类别】</div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">新闻概要部分:</div>
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>新闻概要部分(尽量简明概要)。</div>
                <div class="news_review"><textarea id="news_review"></textarea></div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">信息主要内容:</div>
                    <div class="error">错误信息</div>
                </div>
                <div class="notice"><em>(必填*)</em>请客观具体的说明打折的情</div>
                <div class="news_content"><textarea id="news_content"></textarea></div>
            </div>
            <div class="line">
            	<div class="input">
                	<div class="label">验证码:</div>
                    <input type="text" class="w60" name="title" />
                    <img src="images/v_code.png" />
                    <div class="error">终于到最后一步啦</div>
                </div>
                <div class="notice"><em>(必填*)</em>终于到最后一步啦，填写好验证码提交，如果看不清楚点击图片刷新，再次感谢您的无私贡献。</div>
            </div>
            <div class="big_sbumit">
            	<input type="submit" value="确认提交折扣信息" />
            </div>