
    $(document).ready(function () {
        $("#btn_submit").click( function(){
            // var id = $("#id").val();
            // var name = $("#name").val();//获取表单的输入值;
            // var password = $("#password").val();//获取表单的输入值;
            // var birth=$("#birth").val() == "" ? null : $("#birth").val();
            // var gender=$('input[name="gender"]:checked').val();
            // var college=$("#college").find("option:selected").text();
            // var department=$("#department").find("option:selected").text();
            var firstName = $("#firstName").val();
            var lastName = $("#lastName").val();
            var gender = $('input[name="gender"]:checked').val();

            var birthDate = $("#birthDate").val();
            console.log(birthDate);
            var registerDate = getNowFormatDate();
            // console.log(registerDate);
            var parentFirstName = $("#parentFirstName").val();
            var parentLastName = $("#parentLastName").val();
            var parentGender = $('input[name="parentGender"]:checked').val();
            var parentAddress = $("#parentAddress").val();
            var parentPhone = $("#parentPhone").val();
            var parentEmail = $("#parentEmail").val();


            $.ajax({
                type: 'POST',
                url: "http://localhost:9090/register",
                contentType: "application/json",//如果想以json格式把数据提交到后台的话，这个必须有，否则只会当做表单提交
                data: JSON.stringify({
                    // "name": name,
                    // "id": parseInt(id),
                    // "password": password,
                    // "birth": birth,
                    // "gender": parseInt(gender),
                    // "college": college,
                    // "department": department
                    "firstName": firstName,
                    "lastName": lastName,
                    "gender": gender,
                    "birthDate": birthDate,
                    "registerDate": registerDate,
                    "parentFirstName": parentFirstName,
                    "parentLastName": parentLastName,
                    "parentGender": parentGender,
                    "parentAddress": parentAddress,
                    "parentPhone": parentPhone,
                    "parentEmail": parentEmail,

                }),
                dataType: "JSON",

                success: function(result) {
                    alert(result.msg)
                },

                error:function(err){
                    alert(err.msg)
                }
            });
        });
    });


var getNowFormatDate =function(){
    var date = new Date();
    var s1 = "-";

    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    return date.getFullYear() + s1 + month + s1 + strDate;

};