<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Building Form Part 1</title>
</head>
<body>
	<form action="building.test" method="post">
    <label for="userType">You are:<span style="color: red">*</span></label><br/>
	<input type="radio" name="userType" value="Owner"/>
	<label for="Owner">Owner</label>
	<input type="radio" name="userType" value="Dealer"/>
	<label for="Dealer">Dealer</label>
    <br/><br/>
        <label>List Property For:</label><br/>
    <select name="propertyList">
        <option value="Sell">Sell</option>
        <option value="Rent">Rent</option>
    </select>
    <br/><br/>
        <label for="listing_type">Property Type:<span style="color: red">*</span></label><br/>
        <input type="radio" name="listing_Type" value="Residential"/><label for="listing_Type">Residential</label>
    <input type="radio" name="listing_Type" value="Commercial"/><label for="Commercial">Commercial</label><br/>
    
    <!--Residential Division-->
    <div id="residentialDiv" style="display:block">
        <input type="radio" name="reBuildingType" value="Apartment"/><label for="Apartment">Apartment/Flat/Building Floor</label>
        <select name="apartmentType">
            <option value="Studio Apartment">Studio Apartment</option>
            <option value="Residential Apartment">Residential Apartment</option>
            <option value="Serviced Apartment">Serviced Apartment</option>
            <option value="Independent Apartment">Independent/Builder Floor</option>
        </select><br/>
        <input type="radio" name="reBuildingType" value="Residental Land"/>
        <label for="Residential Land">Residential Land</label><br/>
        <input type="radio" name="reBuildingType" value="House"><label for="House">House</label>
        <select for="houseType">
            <option value="Independent House/Villa">Independent House/Villa</option>
            <option value="Farm House">Farm House</option>
        </select><br/>
        <input type="radio" name="reBuildingType" value="Other">
        <label for="Other">Other</label>
    </div>
    <br/><br/>
    <!--Commercial Division-->
    <div id="commercialDiv" style="display:block">
        <input type="radio" name="comBuildingType" value="Office">
        <label for="Offices">Offices</label>
        <select name="officeType">
            <option value="Commercial Office">Commercial Office</option>
            <option value="Office in IT Park">Office in IT Park</option>
            <option value="Office in Business Park">Office in Business Park</option>
            <option value="Business Center">Businesss Center</option>
            <option value="Time Share">Time Share</option>
        </select><br/>
        <input type="radio" name="comBuildingType" value="Retail">
        <label for="Retail">Retail</label>
        <select name="retailType">
            <option value="Commercial Shop">Commercial Shop</option>
            <option value="Commercial Showroom">Commercial Showroom</option>
            <option value="Space in Retail Mall">Space in Retail Mall</option>
        </select><br/>
        <input type="radio" name="comBuildingType" value="Land">
        <label for="Land">Land</label>
        <select name="landType">
            <option value="Commercial Land">Commercial Land</option>
            <option value="Agricultural Land">Agricultural Land</option>
            <option value="Industrial Land">Industrial Land</option>
        </select><br/>
        <input type="radio" name="comBuildingType" value="Industry Storage">
        <label for="Industry Storage">Industry Storage</label>
        <select name="industryType">
            <option value="Warehouse">Warehouse</option>
            <option value="Cold Storage">Cold Storage</option>
        </select><br/>
        <input type="radio" name="comBuildingType" value="Hospitality">
        <label for="Hospitality">Hospitality</label>
        <select name="hospitalityType">
            <option value="Hotel/Resorts">Hotel/Resorts</option>
            <option value="Guesthouse/Banquet Halls">Guesthouse/Banquet Halls</option>
        </select><br/>
        <input type="radio" name="comBuildingType" value="Others">
        <label for="Others">Others</label><br/>
        <label for="multipleProperty">Multiple Property Units?</label><br/>
        <input type="radio" name="multipleProperty" value="Yes">
        <label for="Yes">Yes</label>
        <input type="radio" name="multipleProperty" value="No">
        <label for="No">No</label><br/><br/>
        <button>PLACEHOLDER FOR FIRST BUTTON</button>
    </div>
    <br/>
    <br/>
    <br/>
        
        
    <!--SHOULD BE ON SECOND PAGE-->
    <div>
       <label for="address">Address<span style="color:red">*</span></label>
       <input type="text" value="address"><br/>
        <label for="city">City<span style="color:red">*</span></label>
       <input type="text" value="city"><br/>
        <label for="state">State<span style="color:red">*</span></label>
       <input type="text" value="state"><br/>
        <label for="projectName">Project Name(Not required)</label>
       <input type="text" value="projectName"><br/><br/>
        <button>LEADS TO PREVIOUS</button>
        <button>LEADS TO NEXT</button>
    </div>
    <br/>
    <br/>
    <br/>
        
        
        
        
    <!--SHOULD BE ON THIRD PAGE-->
    <div>
        <label for="plotArea">Plot Area</label>
        <input type="text" value="plotArea">
        <label for="areaUnit">Area Unit</label>
        <select name="areaUnit">
            <option value="sq. ft">sq. ft</option>
            <option value="sq. yards">sq. yards</option>
            <option value="m">m</option>
            <option value="acres">acres</option>
        </select><br/>
        <br/>
        <label for="washroomNum">Washrooms:<span style="color:red">*</span></label><br/>
        <select value="washroomNum">
            <option value="None">None</option>
            <option value="Shared">Shared</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="9+">9+</option>
        </select><br/>
        <br/>
        <br/>
        <label for="availability">Availability:<span style="color:red">*</span></label>
        <select value="availability">
            <option value="Under Construction">Under Construction</option>
            <option value="Ready to Move">Ready to Move</option>
        </select><br/>
        <label for="possessionBy">Possession By:<span style="color:red">*</span></label>
        <select value="possessionBy">
            <option value="Within 3 months">Within 3 months</option>
            <option value="Within 6 months">Within 6 months</option>
            <option value="By 2021">By 2021</option>
            <option value="By 2022">By 2022</option>
            <option value="By 2023">By 2023</option>
            <option value="By 2024">By 2024</option>
            <option value="By 2025">By 2025</option>
            <option value="By 2026">By 2026</option>
        </select><br/>
        <label for="ageOfProperty">Age of Property:<span style="color:red">*</span></label>
        <select value="ageOfProperty">
            <option value="0-1 year old">0-1 year old</option>
            <option value="2-3 years old">2-3 years old</option>
            <option value="4-6 years old">4-6 years old</option>
            <option value="7-10 years old">7-10 years old</option>
            <option value="11-15 years old">11-15 years old</option>
            <option value="16-25 years old">16-25 years old</option>
            <option value="26+ years old">26+ years old</option>
        </select><br/><br/>
        <button>LEADS TO PREVIOUS</button>
        <button>LEADS TO NEXT</button>
    </div>
    <br/>
    <br/>
    <br/>
        
    <!--SHOULD BE ON LAST PAGE-->
        <div>
            <label for="ownership">Ownership:<span style="color:red">*</span></label>
            <select name="ownership">
                <option value="Freehold">Freehold</option>
                <option value="Leasehold">Leasehold</option>
                <option value="Power of Attorney">Power of Attorney</option>
                <option value="Cooperative Society">Cooperative Society</option>
            </select><br/>
            <label for="expectedRent">Expected Rent:<span style="color:red">*</span> $</label>
            <input type="number" name="expectedRent" min="600"><br/>
            <label for="expectedPrice">Expected Price:<span style="color:red">*</span> $</label>
            <input type="number" name="expectedPrice" min="50000"><br/>
            <br/>
            <input type="submit" value="Submit Building">
        </div>
    </form>
</body>
</html>