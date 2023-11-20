import React from 'react'
import "./ProfilePage.css"
const ProfilePage = (props) => {
    return (
        <div className='profile-page'>
            {props.children}
        </div>
    )
}
export default ProfilePage;