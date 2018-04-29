$(document).ready(function() {
        var arr;
        $('#updatefile').on('submit',function(e) {
            e.preventDefault();
            var formData = new FormData(document.getElementById("updatefile"));
            $.ajax({   
                url: "FileReciever",
                type: "POST",              
                data: formData,
                cache: false,
                contentType: false,
                processData: false,
                success: function(){
                    swal("File upload", "Upload succesful!", "success");
                    document.getElementById("download").disabled = false;
                    console.log("Ajax: data send successful");
                },            
                error: function(jqXHR,estado,error){
                    console.log(error);
                    console.log(estado);
                }
            });
        });
});