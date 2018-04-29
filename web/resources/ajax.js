//changes the lock icon
function setAction(e) {
    document.getElementById("dropdownAction").innerHTML = e.target.innerText;   

    if(e.target.innerHTML == "Cipher"){
        document.getElementById("lockIcon").classList.remove("fa-lock-open");
        document.getElementById("lockIcon").classList.add("fa-lock");
    }
    else{
        document.getElementById("lockIcon").classList.remove("fa-lock");
        document.getElementById("lockIcon").classList.add("fa-lock-open");
    } 
}

//shoots the action



//downloads the file
function download(){
    swal("File downloaded", "You clicked the button!", "success");
}

function randomColor(theme){
    alert();
	var str="#"+((1<<24)*Math.random()|0).toString(16);
	theme.style.background=""+str;
}
