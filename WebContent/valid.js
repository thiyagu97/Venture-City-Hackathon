function validateForm(){
	var name=document.forms.myform.uname.value;
	var phone=document.forms.myform.Phone.value;
	if(name==""){
		alert("Name must be filled out");
        return false;
	}
	if(isNaN(phone)){
		alert("It should contain numbers only");
        return false;
	}
}