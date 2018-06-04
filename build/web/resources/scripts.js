function ValidateSingleInput(oInput) {
    var file = oInput.id;
    if (oInput.type == "file") {
        var sFileName = oInput.value;
        if (sFileName.length > 0) {
            
            var sCurExtension = ".wav";
            var blnValid = false;
            
            if (sFileName.substr(sFileName.length - sCurExtension.length, sCurExtension.length).toLowerCase() == sCurExtension) {
                blnValid = true;  
            }          
            if (!blnValid) {
                swal("Error", "You can only upload wav files here", "warning");
                oInput.value = "";
                return false;
            }
        }
    }
    setFilename(oInput);
    return true;   
}

//changes the lock icon
function setAction() {
    var src = document.getElementById("algorithmSel");
    var value = src.options[src.selectedIndex].value;

    if(value === "DECRYPT"){
        document.getElementById("lockIcon1").classList.remove("fa-lock");
        document.getElementById("lockIcon1").classList.add("fa-lock-open");
        document.getElementById("newFilename").required = false;
        document.getElementById("newFilename").disabled = true;
        document.getElementById("file").disabled = true;
        document.getElementById("option").value = 1; 
    }
    else{
        document.getElementById("lockIcon1").classList.remove("fa-lock-open");
        document.getElementById("lockIcon1").classList.add("fa-lock");
        document.getElementById("newFilename").disabled = false;
        document.getElementById("newFilename").disabled = false;
        document.getElementById("file").disabled = false;
        document.getElementById("option").value = 2; 
        
    } 
}

//shoots the action
function setFilename(e){
    var src = e.value;
    var res = src.split("\\");
    var filename = res[res.length-1];
    if(e.attributes["id"].value === "file"){
        //validating filesize
        var filesize = parseInt(document.getElementById("file").files[0].size, 10);         
        if(filesize < 1*Math.pow(10,9)){
            document.getElementById("fileInput").innerHTML = filename;
        }
        else{
            swal("File size problem", "The file you entered is bigger than the limit (1GB)", "warning");
            document.getElementById("file").value = "";
        }
    }
    else{
        document.getElementById("musicfileInput").innerHTML = filename;
    }
}

//downloads the file
function download(){
    swal("File downloaded", "You clicked the button!", "success");
}

function setnewFilename(){
    
    var src = document.getElementById("algorithmSel");
    var value = src.options[src.selectedIndex].value;

    if(value === "DECRYPT"){
        var input = document.getElementById("musicfile").value;
        var res = input.split("\\");
        var filename = res[res.length-1];     
        //document.getElementById("newFile").innerHTML = filename.split("\\.",1);
        document.getElementById("new").value = filename; 
    }
    else{
        var input = document.getElementById("newFilename").value;
        //document.getElementById("newFile").innerHTML = input+".wav";
        document.getElementById("new").value = input+".wav";
    }
}
//


