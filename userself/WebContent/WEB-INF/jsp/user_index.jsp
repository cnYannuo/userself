<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>IBolg</title>
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/fontAwesome.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/templatemo-style.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/Style.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/demo.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/imgup.css" />
	</head>

	<body onload="startTime()">
		<form action="" method="post">
		<div class="overlay "></div>
				<p align="right" class="cd-hero" style="padding:15px 20px;color:white;font-weight: bold;">
				欢迎，作者ID|<a href="denglu.html">退出</a>
		        </p>
		<section class="top-part ">
			<video controls autoplay loop>
				<source src="videos/video.mp4 " type="video/mp4 ">
				<source src="videos/video.ogg " type="video/ogg "> Your browser does not support the video tag.
			</video>
		</section>

		<section class="cd-hero ">

			<div class="cd-slider-nav ">
				<nav>
					<span class="cd-marker item-1 "></span>
					<ul>
						<li class="selected ">
							<a href="#0 ">
								<div class="image-icon "><img src="img/home-icon.png "></div>
								<h6>个人资料</h6></a>
						</li>
						<li>
							<a href="#0 ">
								<div class="image-icon "><img src="img/featured-icon.png "></div>
								<h6>我的文章</h6></a>
						</li>
						<li>
							<a href="#0 ">
								<div class="image-icon "><img src="img/projects-icon.png "></div>
								<h6>照片墙</h6></a>
						</li>
						<li>
							<a href="#0 ">
								<div class="image-icon "><img src="img/contact-icon.png "></div>
								<h6>评论区</h6></a>
						</li>
					</ul>
				</nav>
			</div>
			<!-- .cd-slider-nav -->

			<ul class="cd-hero-slider ">

				<li class="selected ">
					<div class="heading ">
						<h1>个人资料</h1>
					</div>
					<div class="cd-full-width first-slide ">
						<div class="container ">
							<div class="row ">
								<div class="col-md-3 "></div>
								<div class="col-md-6 ">
									<div class="content first-content userTable ">
									<label for="user_img ">头像:</label> <img id="user_img" class="img-circle" src="${pageContext.request.contextPath }/img/${user.user_img}" height="100px " width="100px"><br>	
									<label for="user_name ">名称:</label> <span id="user_name">${user.user_name }</span><br />			
									<label for="user_birthday ">生日:</label> <input type="text" id="user_birthday "/> ${user.user_birthday }<br>
									<label for="user_sex ">性别:</label> <input type="text" id="user_sex "/>${user.user_sex }<br>
									<label for="user_like ">爱好:</label> <input type="text" id="user_like "/>${user.user_like }<br>
									<label for="user_jj">简介:</label> <textarea id="user_jj ">${user.user_jj }	</textarea>
									</div>
								</div>
								<div class="col-md-3 "></div>
							</div>
						</div>
					</div>
				</li>

				<li>
					<div class="heading ">
						<h1>我的文章</h1>
					</div>
					<div class="cd-half-width third-slide ">
						<div class="container ">
							<div class="row ">
								<div class="col-md-2 "></div>
											<div class="col-md-8 ">
												<div class="content third-content ">
												<c:forEach items="#{ }" var="airtical">
													<div class="easyTable">																									
														<h4 id="airtical_title">文章标题,不超过15个字符 </h4>
														<span style="font-size:13px;float:right">
															<span class="airtical_category essaylab">web前端</span>&nbsp;&nbsp;&nbsp;&nbsp;
															<span class="fa fa-fire" style="color:red"><span  id="airtical_hot" style="color:black">0</span></span>
															&nbsp;&nbsp;&nbsp;&nbsp;
															<span class="airtical_date">2017-09-24</span>
														</span>
														<div class="textArea" id="airticai_content">
															请开始你的表演。。。请开始你的表演。。这是我的第一篇文章是的配方惊世毒回家上课地方比不过asof何时可掇好的给讲课hi股好地方是的郭德纲
														</div>						
													</div>
												</c:forEach>
												
											</div>
									</div>		
							</div>
							<div class="col-md-2 "></div>
							</div>
						</div>
				</li>

				<li>
					<div class="heading ">
						<h1>照片墙</h1>
					</div>
					<div class="cd-half-width fourth-slide ">
						<div class="container ">
							<div class="row ">
								<div class="col-md-12 ">
									
									<div class="content fourth-content ">
										
										<input type="text" value="相册名" id="photo_name" style="float:left">
										 <!--图片选择对话框-->
									    <div id="div_imgfile"><img src="img/image.png"></div>
									
									    <!--图片预览容器-->
									    <div id="div_imglook">
									        <div style="clear: both;"></div>
									    </div>
									    <br />
									     共<span id="photo_num">0</span>张图片
									     <br /><br /><br />
									    <!--确定上传按钮-->
									    <input type="button" value="确定上传" id="btn_ImgUpStart" />

										
									</div>
					            </div>
					        </div>
					</div>

				</li>

				<li>
					<div class="heading ">
						<h1>评论区</h1>
					</div>
					<div class="cd-half-width fivth-slide ">
						<div class="container ">
							<div class="row ">
							
								<div class="col-md-12 ">
									<div class="content fivth-content ">

										<div class="left-info ">
											<textarea>说点啥。。。
										    </textarea><br /><br />
                                          
											<div style="LINE-HEIGHT: 12px" id="bdshare" class="bdshare_b"><img src="img/type-button-1.jpg"> </div>
											<script id="bdshare_js" type="text/javascript" data="type=button&uid=664845" src="js/Share.js"></script>

											<br/>
											<br/>
										</div>
										<fieldset>
											<button type="submit " id="form-submit " class="btn ">提交</button>
										</fieldset>
		
									</div>
								</div>
						
							</div>
						</div>
					</div>
				</li>
			</ul>
			<!-- .cd-hero-slider -->
		</section>
		<!-- .cd-hero -->
        </form>
		<footer>
			<p>Copyright &copy; 作者ID</p>

		</footer>
  
		<script src="${pageContext.request.contextPath }/js/jquery-1.11.2.min.js "></script>
		<script src="${pageContext.request.contextPath }/js/jquery-migrate-1.2.1.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js "></script>
		<script src="${pageContext.request.contextPath }/js/main.js "></script>
		<script src="${pageContext.request.contextPath }/js/NowTime.js"></script>
		<script src="${pageContext.request.contextPath }/js/imgup.js"></script>
	</body>

</html>