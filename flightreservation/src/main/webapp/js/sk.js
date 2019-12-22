/**
 * 
 */
function validateForm() {
	// var radios = document.getElementsByName("type");
	// var radioChecked = false;
	var inputs = false;
	var a = document.frm.firstname.value.value;
	if (document.frm.firstname.value == "") {
		// alert("firstname cannot be blank!!");
		inputs = false;
	} else {
		inputs = true;
	}
	if (document.frm.lastname.value == "") {
		// alert("lastname cannot be blank!!");
		inputs = false;
	} else {
		inputs = true;
	}
	if (document.frm.password.value == "") {
		// alert("password cannot be blank!!");
		inputs = false;
	} else {
		inputs = true;
	}
	if (document.frm.confirmPassword.value == "") {
		// alert("confirmPassword cannot be blank!!");
		inputs = false;
	} else {
		inputs = true;
	}
	var pass = false;
	if (inputs) {
		if (document.frm.confirmPassword.value == document.frm.password.value) {
			pass = true;
		} else {
			alert("password and confirmPassword should match!!");
			pass = false;
		}
	} else {
		alert("enter all the fields!!");
	}
	return inputs && pass;
}