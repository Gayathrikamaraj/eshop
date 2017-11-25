<div class="container">

	<div class="row">

		<!-- would be to display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>





		</div>
		<!-- to disply the actual products -->
		<div class="col-md-9">

			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProduct == true }">
						<ol class="breadcrumb">

							<li><a herf="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>


						</ol>
					</c:if>

					<c:if test="${userClickCategoryProduct == true }">
						<ol class="breadcrumb">

							<li><a herf="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}Category</li>

						</ol>
					</c:if>






				</div>

			</div>



		</div>

	</div>






</div>
"
