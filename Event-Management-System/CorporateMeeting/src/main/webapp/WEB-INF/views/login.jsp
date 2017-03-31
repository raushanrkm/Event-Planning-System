<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>


			    	<h3 class="panel-title">Please sign in</h3>
			 	
			  	<div class="panel-body">
			  	<c:if test="${not empty error}">
					<div class="alert alert-danger">
						<spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br />
					</div>
				</c:if>
			    	<form action="<spring:url value="postLogin"></spring:url>" method="post">
                    <fieldset>
			    	  	<div class="form-group">
			    		    <input class="form:input-large" placeholder="User Name" name='username' type="text">
			    		</div>
			    		<div class="form-group">
			    			<input class=" form:input-large" placeholder="Password" name='password'  type="password" value="">
			    		</div>
		    			<div class="form-group">
			    			<input type='checkbox' name="keepMe"/>Remember Me? <br/>	
			    		</div>
			    		<input class="btn btn-lg btn-success btn-mini" type="submit" value="Login">
			    	</fieldset>
			      	</form>
			    </div>

</body>
