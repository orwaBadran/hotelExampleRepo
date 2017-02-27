<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<title>Hotels</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<link href="assets/css/font-awesome.min.css" rel="stylesheet" />
<link href="assets/css/style.css" rel="stylesheet" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css' />
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="font-awesome/css/font-awesome.min.css" />
<script type="text/javascript" src="webjars/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<section id="footer-main">
	<div class="overlay"></div>
	</section>
	<section id="book-hotel-sec">
	<div class="container">
		<div class="row  move-me">
			<div class="col-lg-4 col-md-4 col-sm-4 ">
				<h1>Reserve a Hotel</h1>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 ">
				<div class="tab-pane fade in active" id="home">

					<h3 class="head text-center">User Info</h3>
					<p class="narrow text-center">
					<p>
						Language: <span>${root.offerInfo.language}</span>
					</p>
					<p>
						currency: <span>${root.offerInfo.currency}</span>
					</p>
					<p>
						User ID: <span>${root.userInfo.userId}</span>
					</p>
					
				</div>

			</div>
		</div>

		<div class="row pad-top  move-me wow bounceIn animated">
			<c:forEach items="${root.offers.hotel}" var="hotels">
				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Hotel: ${hotels.hotelInfo.hotelName}</h3>
							<span class="pull-right clickable"><i>more</i></span>
						</div>
						<div class="panel-body">
							<div class="col-lg-4 col-md-4 col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Destination</h3>
										<span class="pull-right clickable"><i>more</i></span>
									</div>
									<div class="panel-body">
										<ul>
											<li>Region ID: ${hotels.destination.regionID}</li>
											<li>Long Name: ${hotels.destination.longName}</li>
											<li>Country: ${hotels.destination.country}</li>
											<li>Province: ${hotels.destination.province}</li>
											<li>City: ${hotels.destination.city}</li>
										</ul>
									</div>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Hotel Info</h3>

									</div>
									<div class="panel-body scrollable">
									<img src="https://images.trvl-media.com/hotels/6000000/5070000/5065600/5065557/5065557_32_t.jpg" />
										<ul>
											<li>Hotel Name: ${hotels.hotelInfo.hotelName}</li>
											<li>Hotel Destination : ${hotels.hotelInfo.hotelDestination}</li>
											<li>Hotel Destination Region ID: ${hotels.hotelInfo.hotelDestinationRegionID}</li>
											<li>Hotel Long Destination: ${hotels.hotelInfo.hotelLongDestination}</li>
											<li>Hotel Street Address: ${hotels.hotelInfo.hotelStreetAddress}</li>
											<li>Hotel City: ${hotels.hotelInfo.hotelCity}</li>
											<li>Hotel Province: ${hotels.hotelInfo.hotelProvince}</li>
											<li>Hotel Country Code: ${hotels.hotelInfo.hotelCountryCode}</li>
											<li>Hotel Location: <a href=${'https://www.google.com/maps/preview/@'.concat(hotels.hotelInfo.hotelLocation)} > Location On Map </a></li>
											<li>Hotel StarRating: ${hotels.hotelInfo.hotelStarRating}</li>
											<li>Hotel Guest Review Rating: ${hotels.hotelInfo.hotelGuestReviewRating}</li>
											<li>Travel Start Date: ${hotels.hotelInfo.travelStartDate}</li>
											<li>Travel End Date: ${hotels.hotelInfo.travelEndDate}</li>
											<li>Car Package Score: ${hotels.hotelInfo.carPackageScore}</li>
											<li>Description: ${hotels.hotelInfo.description}</li>
											<li>Language: ${hotels.hotelInfo.language}</li>
											<li>Promotion Amount: ${hotels.hotelInfo.promotionAmount}</li>
											<li>Promotion Description: ${hotels.hotelInfo.promotionDescription}</li>
											<li>Status Description:,</li>
											<li>All Inclusive: ${hotels.hotelInfo.allInclusive ? 'Yes' : 'No'}</li>
											<li>Car Package: ${hotels.hotelInfo.carPackage ? 'Yes' : 'No'}</li>
										</ul>
									</div>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Hotel Urgency Info</h3>

									</div>
									<div class="panel-body scrollable">
										<ul>
											<li>Number Of People Viewing: ${hotels.hotelUrgencyInfo.numberOfPeopleViewing}</li>
											<li>Number Of People Booked: ${hotels.hotelUrgencyInfo.numberOfPeopleBooked}</li>
											<li>Number Of Rooms Left: ${ numberOfRoomsLeft}</li>
											<li>Last Booked Time: ${hotels.hotelUrgencyInfo.lastBookedTime}</li>
											<li>Almost Sold Status: ${hotels.hotelUrgencyInfo.almostSoldStatus}</li>
											<li>Link: <a href=${'https://offersvc.expedia.com/'.concat(hotels.hotelUrgencyInfo.link)}>here</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Air Attach Enabled</h3>

									</div>
									<div class="panel-body">
										<ul>
											<li>false</li>
										</ul>
									</div>
								</div>
							</div>

							<div class="col-lg-4 col-md-4 col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Hotel Pricing Info</h3>

									</div>
									<div class="panel-body scrollable">
										<ul>
											<li>Average Price Value:43.79,</li>
											<li>Total Price Value:144.51,</li>
											<li>Original Price Per Night:48.96,</li>
											<li>Hotel Total Base Rate:146.88,</li>
											<li>Hotel Total Taxes And Fees:13.14,</li>
											<li>Currency:USD,</li>
											<li>Hotel Total Mandatory Taxes And Fees:0.0,</li>
											<li>Percent Savings:10.56,</li>
											<li>drr:true</li>
										</ul>
									</div>
								</div>
							</div>

							<div class="col-lg-4 col-md-4 col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Hotel Pricing Info</h3>

									</div>
									<div class="panel-body ">
										<ul>
											<li><a
												href="http%3A%2F%2Fdeals.expedia.com%2Fbeta%2Fhotel_redirect%3Fgde_deep_link%3Dhttp%25253A%25252F%25252Fwww.expedia.com%25252Fgo%25252Fhotel%25252Finfo%25252F5065557%25252F2017-03-28%25252F2017-03-31%25253FNumRooms%25253D1%252526NumAdult-Room1%25253D2%252526rateplanid%25253D200976871_24%252526tpid%25253D1%252526langid%25253D1033%26gde_index%3D0%26gde_hash%3D655a19432827c5d63e6e21a9d5e46535%26gde_type%3DHotel%26gde_hotel%3Dtrue%26gde_hotel_id%3D5065557%26gde_check_in_date%3D2017-03-28%26gde_check_out_date%3D2017-03-31%26gde_price%3D144.51">hotel
													Info site</a></li>
											<li><a
												href=" http%3A%2F%2Fdeals.expedia.com%2Fbeta%2Fhotel_redirect%3Fgde_deep_link%3Dhttp%25253A%25252F%25252Fwww.expedia.com%25252Fpubspec%25252Fscripts%25252Feap.asp%25253FGOTO%25253DHOTSEARCH%252526SearchType%25253DPlace%252526PlaceName%25253DValencia%25252C%252BValencia%25252C%252BESP%252526InDate%25253D3%25252F28%25252F17%252526OutDate%25253D3%25252F31%25252F17%252526langid%25253D1033%26gde_index%3D0%26gde_hash%3D655a19432827c5d63e6e21a9d5e46535%26gde_type%3DHotel%26gde_hotel%3Dtrue%26gde_hotel_id%3D5065557%26gde_check_in_date%3D2017-03-28%26gde_check_out_date%3D2017-03-31%26gde_price%3D144.51">hotel
													Search Result:</a></li>
										</ul>
									</div>
								</div>
							</div>


							<div class="col-lg-4 col-md-4 col-sm-12">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Hotel Scores</h3>

									</div>
									<div class="panel-body ">
										<ul>
											<li>Raw Appeal Score:43.79,</li>
											<li>Moving Average Score:-0.91</li>
										</ul>

									</div>
								</div>
							</div>

						</div>
					</div>

				</div>
			</c:forEach>
		</div>
	</section>
	<!-- book-hotel SECTION END-->
	<section id="footer-main" style="height:300px; ">
	<div class="overlay"></div>
	</section>
	<script type="text/javascript">
		jQuery(function($) {
			$('.panel-heading span.clickable').on(
					"click",
					function(e) {
						if ($(this).hasClass('panel-collapsed')) {
							// expand the panel
							$(this).parents('.panel').find('.panel-body')
									.slideDown();
							$(this).removeClass('panel-collapsed');
							$(this).find('i').removeClass(
									'glyphicon-chevron-down').addClass(
									'glyphicon-chevron-up');
						} else {
							// collapse the panel
							$(this).parents('.panel').find('.panel-body')
									.slideUp();
							$(this).addClass('panel-collapsed');
							$(this).find('i').removeClass(
									'glyphicon-chevron-up').addClass(
									'glyphicon-chevron-down');
						}
					});
		});
	</script>
</body>
</html>