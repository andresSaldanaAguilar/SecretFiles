$(document).ready(function(){
        $('#updatefile').on('submit',function(e) {
            e.preventDefault();
            
            //validating key size
            var algorithm = document.getElementById("algorithm").value;
            var key = document.getElementById("key").value;
            var isValidKey = false;
            if(algorithm === "DES"){
                if(key.length === 8)
                    isValidKey = true;
            }
            else{
                if(key.length === 16)
                    isValidKey = true;
            }
            //if key is valid..
            if(isValidKey){
                var formData = new FormData(document.getElementById("updatefile"));
                $.ajax({   
                    url: "FileReciever",
                    type: "POST",              
                    data: formData,
                    cache: false,
                    contentType: false,
                    processData: false,
                    success: function(message){
                        //getting rid of enter
                        message = message.replace(/[\r\n]/g,"");
                        if(message === "true"){
                            swal("Correct", "Action succesful!", "success");
                            document.getElementById("download").disabled = false;
                            console.log("Ajax: data send successful");
                            //clean fields
                            document.getElementById("file").value = "";
                            document.getElementById("musicfile").value = "";
                        }else{
                            swal("An error has ocurred while processing the file", "-Check if your password is correct\n-Check if the algorithm or mode is the correct\n-The file is corrupted or not the correct", "error");
                        }
                    },            
                    error: function(jqXHR,estado,error){
                        console.log(error);
                        console.log(estado);
                    }
                });
            }
            else swal("Key size problem", "Key sizes are:\nAES: 16 characters\nDES: 8 characters", "error");
        });
        
        $body = $("body");

$(document).on({
    ajaxStart: function() { $body.addClass("loading");    },
     ajaxStop: function() { $body.removeClass("loading"); }    
});
});



