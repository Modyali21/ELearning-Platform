import "./ProfileImage.css"
import { useState,useEffect } from "react"
import {useAuth,upload} from "../firebase"

export const ProfileImage = () => {
    const currentUser = useAuth();
    // const [photo,setPhoto] = useState(null); 
    const [loading,setLoading] = useState(false);
    const [photoURL,setPhotoURL] = useState("https://media.istockphoto.com/id/1337144146/vector/default-avatar-profile-icon-vector.jpg?s=612x612&w=0&k=20&c=BIbFwuv7FxTWvh5S3vB6bkT0Qv8Vn8N5Ffseq84ClGI=");
    
    function handleBrowse(event){
        // setPhoto(event.target.files[0]);
        upload(event.target.files[0],currentUser,setLoading,setPhotoURL);
    }

    useEffect(()=>{
        if(currentUser?.photoURL){
            setPhotoURL(currentUser.photoURL)
        }
    },[currentUser])



    return (
        <div>
            <div className="profile">
                <img src={photoURL} alt='profile' className='profile-img'/>
                <input  type="file" id="file-input" name="file-input" onChange={handleBrowse}/>
                <label style={{backgroundColor: loading? "grey" : "white"}} disabled={loading} id="file-input-label" for="file-input">Select a File</label>
            </div>
            
        </div>
        
        )
}
