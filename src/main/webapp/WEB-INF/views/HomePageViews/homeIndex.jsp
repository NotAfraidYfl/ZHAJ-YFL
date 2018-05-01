<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HomePage</title>
<%@include file="/WEB-INF/views/common/common.jsp"%>
<script src="${ctx }/static/jsFramework/responsiveslides.min.js"></script>
<script>
	$(function() {
		$("#slider").responsiveSlides({
			auto : true,
			nav : false,
			speed : 500,
			namespace : "callbacks",
			pager : true,
		});
	});
</script>
<link href="${ctx }/static/cssFramework/owl.carousel.css"
	rel="stylesheet">
<script src="${ctx }/static/jsFramework/owl.carousel.js"></script>
<script>
	$(document).ready(function() {
		$("#owl-demo").owlCarousel({
			items : 1,
			lazyLoad : true,
			autoPlay : true,
			navigation : false,
			navigationText : false,
			pagination : true,
		});
	});
</script>
</head>
<body>
	<%@include file="/WEB-INF/views/header/header.jsp"%>
	<!---banner--->
	<div class="slider">
		<div class="callbacks_container">
			<ul class="rslides" id="slider">
				<div class="slid banner1">
					<div class="caption">
						<h3>1400 Anastasia Avenue</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Donec nec pellentesque ex. Morbi iaculis mi in varius auctor.
							Nullam feugiat erat .</p>
						<a href="#" class="button">know more</a>
					</div>
				</div>
				<div class="slid banner2">
					<div class="caption">
						<h3>Oakland, NJ94605</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Donec nec pellentesque ex. Morbi iaculis mi in varius auctor.
							Nullam feugiat erat .</p>
						<a href="#" class="button">know more</a>
					</div>
				</div>
				<div class="slid banner3">
					<div class="caption">
						<h3>Florida 5, Pinecrest, FL</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Donec nec pellentesque ex. Morbi iaculis mi in varius auctor.
							Nullam feugiat erat .</p>
						<a href="#" class="button">know more</a>
					</div>
				</div>
			</ul>
		</div>
	</div>
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/">网页模板</a>
	</div>
	<!---banner--->
	<div class="content">
		<div class="place-section">
			<div class="container">
				<h2>find your place</h2>
				<div class="place-grids">
					<div class="col-md-3 place-grid">
						<h5>all location</h5>
						<select class="sel">
							<option value="">All Locations</option>
							<option value="">New Jersey</option>
							<option value="">New York</option>
							<option value="">Australia</option>
							<option value="">Canada</option>
							<option value="">India</option>
						</select>
					</div>
					<div class="col-md-3 place-grid">
						<h5>all sub location</h5>
						<select class="sel">
							<option value="">All Locations</option>
							<option value="">New Jersey</option>
							<option value="">New York</option>
							<option value="">Australia</option>
							<option value="">Canada</option>
							<option value="">India</option>
						</select>
					</div>
					<div class="col-md-3 place-grid">
						<h5>Property Status</h5>
						<select class="sel">
							<option value="">All status</option>
							<option value="">none</option>
							<option value="">open house</option>
							<option value="">rent</option>
							<option value="">sale</option>
						</select>
					</div>
					<div class="col-md-3 place-grid">
						<h5>Property Type</h5>
						<select class="sel">
							<option value="">All Type</option>
							<option value="">Commercial</option>
							<option value="">- Office</option>
							<option value="">- Buy</option>
							<option value="">Residential</option>
							<option value="">-Apartment</option>
						</select>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="place-grids">
					<div class="col-md-2 place-grid1">
						<h5>Min Beds</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">1</option>
							<option value="">2</option>
							<option value="">3</option>
							<option value="">4</option>
							<option value="">5</option>
						</select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Min Baths</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">1</option>
							<option value="">2</option>
							<option value="">3</option>
							<option value="">4</option>
							<option value="">5</option>
						</select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Min Price</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">$500</option>
							<option value="">$1000</option>
							<option value="">$2000</option>
							<option value="">$3000</option>
							<option value="">$4000</option>
							<option value="">$5000</option>
							<option value="">$75000</option>
							<option value="">$10000</option>
						</select>
					</div>
					<div class="col-md-2 place-grid1">
						<h5>Max Price</h5>
						<select class="sel">
							<option value="">any</option>
							<option value="">￥1000</option>
							<option value="">￥2000</option>
							<option value="">￥3000</option>
							<option value="">￥4000</option>
							<option value="">￥5000</option>
							<option value="">￥75000</option>
							<option value="">￥10000</option>
						</select>
					</div>
					<div class="col-md-4 search">
						<form action="forrent.html">
							<input type="submit" value="Search">
						</form>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div class="friend-agent">
			<div class="container">
				<div class="friend-grids">
					<div class="col-md-4 friend-grid">
						<img src="${ctx}/static/images/p.png">
						<h4>Search From Anywhere</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Nulla convallis egestas rhoncus. Donec facilisis fermentum sem,
							ac viverra ante luctus vel.</p>
					</div>
					<div class="col-md-4 friend-grid">
						<img src="${ctx}/static/images/p1.png">
						<h4>Friendly Agents</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Nulla convallis egestas rhoncus. Donec facilisis fermentum sem,
							ac viverra ante luctus vel.</p>
					</div>
					<div class="col-md-4 friend-grid">
						<img src="${ctx}/static/images/p2.png">
						<h4>Buy or Rent</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Nulla convallis egestas rhoncus. Donec facilisis fermentum sem,
							ac viverra ante luctus vel.</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<div class="offering">
			<div class="container">
				<h3>We are Offering the Best Real Estate Deals</h3>
				<div class="offer-grids">
					<div class="col-md-6 offer-grid">
						<div class="offer-grid1">
							<h4>
								<a href="single.html">Villa In Hialeah, Dade County</a>
							</h4>
							<div class="offer1">
								<div class="offer-left">
									<a href="single.html" class="mask"><img
										src="${ctx}/static/images/p3.jpg"
										class="img-responsive zoom-img" alt="" /></a>
								</div>
								<div class="offer-right">
									<h5>
										<label>$</label> 7,500 Per Month - <span>Single Family
											Home</span>
									</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
										elit, sed diam nonummy nibh…</p>
									<a href="single.html" class="button1">more details</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-6 offer-grid">
						<div class="offer-grid1">
							<h4>
								<a href="single.html">401 Biscayne Boulevard, Miami</a>
							</h4>
							<div class="offer1">
								<div class="offer-left">
									<a href="single.html" class="mask"><img
										src="${ctx}/static/images/p4.jpg"
										class="img-responsive zoom-img" alt="" /></a>
								</div>
								<div class="offer-right">
									<h5>
										<label>$</label> 3,250 Per Month - <span>Condominium</span>
									</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
										elit, sed diam nonummy nibh…</p>
									<a href="single.html" class="button1">more details</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="offer-grids">
					<div class="col-md-6 offer-grid">
						<div class="offer-grid1">
							<h4>
								<a href="single.html">3895 NW 107th Ave</a>
							</h4>
							<div class="offer1">
								<div class="offer-left">
									<a href="single.html" class="mask"><img
										src="${ctx}/static/images/p5.jpg"
										class="img-responsive zoom-img" alt="" /></a>
								</div>
								<div class="offer-right">
									<h5>
										<label>￥</label> 5,200 Per Month - <span>Office</span>
									</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
										elit, sed diam nonummy nibh…</p>
									<a href="single.html" class="button1">more details</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-6 offer-grid">
						<div class="offer-grid1">
							<h4>
								<a href="single.html">1400 Anastasia Avenue, Coral</a>
							</h4>
							<div class="offer1">
								<div class="offer-left">
									<a href="single.html" class="mask"><img
										src="${ctx}/static/images/p6.jpg"
										class="img-responsive zoom-img" alt="" /></a>
								</div>
								<div class="offer-right">
									<h5>
										<label>￥</label> 525,000 - <span>Villa</span>
									</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
										elit, sed diam nonummy nibh…</p>
									<a href="single.html" class="button1">more details</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="offer-grids">
					<div class="col-md-6 offer-grid">
						<div class="offer-grid1">
							<h4>
								<a href="#">12 Apartments Of Type A</a>
							</h4>
							<div class="offer1">
								<div class="offer-left">
									<a href="single.html" class="mask"><img
										src="${ctx}/static/images/p7.jpg"
										class="img-responsive zoom-img" alt="" /></a>
								</div>
								<div class="offer-right">
									<h5>
										<label>￥</label> 3,200 Per Month - <span>Apartment</span>
									</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
										elit, sed diam nonummy nibh…</p>
									<a href="single.html" class="button1">more details</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-6 offer-grid">
						<div class="offer-grid1">
							<h4>
								<a href="single.html">20 Apartments Of Type B</a>
							</h4>
							<div class="offer1">
								<div class="offer-left">
									<a href="single.html" class="mask"><img
										src="${ctx}/static/images/p8.jpg"
										class="img-responsive zoom-img" alt="" /></a>
								</div>
								<div class="offer-right">
									<h5>
										<label>￥</label> 4,200 Per Month - <span>Apartment</span>
									</h5>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
										elit, sed diam nonummy nibh…</p>
									<a href="single.html" class="button1">more details</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!---Featured Properties--->
		<div class="feature-section">
			<div class="container">
				<h3>Featured Properties</h3>
				<div class="feature-grids">
					<div class="col-md-3 feature-grid">
						<img src="${ctx}/static/images/f1.jpg" class="img-responsive"
							alt="/">
						<h5>Villa in Hialeah, Dade</h5>
						<p>
							Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
								More</a>
						</p>
						<span>￥2,500 Per Month</span>
					</div>
					<div class="col-md-3 feature-grid">
						<img src="${ctx}/static/images/f2.jpg" class="img-responsive"
							alt="/">
						<h5>401 Biscayne Boulevard</h5>
						<p>
							Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
								More</a>
						</p>
						<span>￥7,500 Per Month</span>
					</div>
					<div class="col-md-3 feature-grid">
						<img src="${ctx}/static/images/f3.jpg" class="img-responsive"
							alt="/">
						<h5>154 Southwest Terra</h5>
						<p>
							Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
								More</a>
						</p>
						<span>￥9,500 Per Month</span>
					</div>
					<div class="col-md-3 feature-grid">
						<img src="${ctx}/static/images/f4.jpg" class="img-responsive"
							alt="/">
						<h5>Florida 5, Pinecrest, FL</h5>
						<p>
							Lorem ipsum dolor sit amet, consectetuer elit,… <a href="#">Know
								More</a>
						</p>
						<span>￥5,500 Per Month</span>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!---Featured Properties--->
		<div class="membership">
			<div class="container">
				<h3>Membership Plans</h3>
				<div class="membership-grids">
					<div class="col-md-4 membership-grid">
						<h4>Personal</h4>
						<div class="membership1">
							<h5>
								9.99 <span>USD</span>
							</h5>
							<h6>/ 1 month</h6>
							<ul class="member">
								<li>10 Listings</li>
								<li>2 Featured Listings</li>
							</ul>
						</div>
					</div>
					<div class="col-md-4 membership-grid">
						<h4>Professional</h4>
						<div class="membership1">
							<h5>
								49.99 <span>USD</span>
							</h5>
							<h6>/ 6 month</h6>
							<ul class="member">
								<li>40 Listings</li>
								<li>10 Featured Listings</li>
							</ul>
						</div>
					</div>
					<div class="col-md-4 membership-grid">
						<h4>Bussiness</h4>
						<div class="membership1">
							<h5>
								99.99 <span>USD</span>
							</h5>
							<h6>/ 1 year</h6>
							<ul class="member">
								<li>Unlimited Listings</li>
								<li>20 Featured Listings</li>
							</ul>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!---testimonials--->
		<div class="testimonials">
			<div class="container">
				<h3>testimonial</h3>
				<span></span>
				<div id="owl-demo" class="owl-carousel">
					<div class="item">
						<div class="col-md-2 testmonial-img">
							<img src="${ctx}/static/images/t1.png" class="img-responsive"
								alt="" />
						</div>
						<div class="col-md-10 testmonial-text">
							<p>Lorem ipsum dolor sit amet, offendit volutpat sea ex, at
								omnium scripta pro, at omnium scripta pro, ei mea oratio malorum
								forensibus. ei mea oratio malorum forensibus. Sed ei omnes
								laoreet posidonium ei mea oratio malorum forensibus.</p>
							<h4>
								<a href="#">Michael Feng</a>
							</h4>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="item">
						<div class="col-md-2 testmonial-img">
							<img src="${ctx}/static/images/t2.png" class="img-responsive"
								alt="" />
						</div>
						<div class="col-md-10 testmonial-text">
							<p>Lorem ipsum dolor sit amet, offendit volutpat sea ex, at
								omnium scripta pro, at omnium scripta pro, ei mea oratio malorum
								forensibus. ei mea oratio malorum forensibus. Sed ei omnes
								laoreet posidonium ei mea oratio malorum forensibus.</p>
							<h4>
								<a href="#">Stacy Barron</a>
							</h4>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="item">
						<div class="col-md-2 testmonial-img">
							<img src="${ctx}/static/images/t3.png" class="img-responsive"
								alt="" />
						</div>
						<div class="col-md-10 testmonial-text">
							<p>Lorem ipsum dolor sit amet, offendit volutpat sea ex, at
								omnium scripta pro, at omnium scripta pro, ei mea oratio malorum
								forensibus. ei mea oratio malorum forensibus. Sed ei omnes
								laoreet posidonium ei mea oratio malorum forensibus.</p>
							<h4>
								<a href="#">Johnson </a>
							</h4>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		</div>
		<!---testmonials--->
	</div>
	<!---footer--->
	<div class="footer-section">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-3 footer-grid">
					<h4>About Real Homes</h4>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
						sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna
						aliquam erat volutpat.</p>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>Recent Posts</h4>
					<ul>
						<li><a href="#">Lorem Post With Image Format</a></li>
						<li><a href="#">Example Video Blog Post</a></li>
						<li><a href="#">Example Post With Gallery Post </a></li>
						<li><a href="#">Example Video Blog Post</a></li>
						<li><a href="#">Lorem Post With Image Format</a></li>
						<li><a href="#">Example Video Blog Post</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>Useful links</h4>
					<ul>
						<li><a href="terms.html">Terms of Use</a></li>
						<li><a href="privacy.html">Privacy Policy</a></li>
						<li><a href="contact.html">Contact Support </a></li>
						<li><a href="agents.html"> All Agents</a></li>
						<li><a href="blog.html">Blog</a></li>
						<li><a href="faqs.html">FAQs</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<h4>Get In Touch</h4>
					<p>8901 Marmora Road</p>
					<p>Glasgow, DO4 89GR.</p>
					<p>Freephone : +1 234 567 890</p>
					<p>Telephone : +1 234 567 890</p>
					<p>FAX : + 1 234 567 890</p>
					<p>
						E-mail : <a href="mailto:example@mail.com"> example@mail.com</a>
					</p>
				</div>
				<div class="clearfix"></div>
			</div>

		</div>
	</div>
	<!---footer--->
	<!--copy-->
	<div class="copy-section">
		<div class="container">
			<p>
				Copyright &copy; 2016.Company name All rights reserved.More
				Templates <a href="http://www.cssmoban.com/" target="_blank"
					title="模板之家">模板之家</a> - Collect from <a
					href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
			</p>
		</div>
	</div>
</body>
</html>
