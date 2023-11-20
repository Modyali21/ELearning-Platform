import React from 'react'
import "./UserInfo.css"
import { FaInstagram,FaWhatsapp,FaLinkedin  } from "react-icons/fa";
import { FaPhone } from "react-icons/fa6";
// import { IoIosInformationCircle } from "react-icons/io";

const UserInfo = () => {
    return (
        <div className='user-info-container'>

            <div className='userinfo' >
                <section id='user'>USER INFORMATION</section>
                <div className='info-container'>
                    <ul>
                        <li >Name: <span>Mohamed Aly</span></li>
                        <li >Date of Birth: <span>21/5/2001</span></li>
                        <li >Gende: <span>Male</span></li>
                        <li >School: <span>Zahran language school</span></li>
                        <li >Worked at: <span></span></li>
                    </ul>
                </div>
            </div>

            <div className='userinfo' >
                <section id='user'>SOCIAL MEDIA</section>
                <div className='sm-container'>
                    <ul>
                        <li>
                            <div className='social-media'>
                                <span><FaPhone  fontSize={"32px"} /></span>
                                <a href='/'>+20 01551616660</a >
                            </div>
                        </li>
                        <li>
                            <div className='social-media'>
                                <span><FaInstagram fontSize={"32px"} /></span>
                                <a href='/'>https://www.instagram.com/modyaly2152001/?next=%2F</a>
                            </div>
                        </li>
                        <li>
                            <div className='social-media'>
                                <span><FaWhatsapp fontSize={"32px"} /></span>
                                <a href='/'>https://www.instagram.com/modyaly2152001/?next=%2F</a>
                            </div>
                        </li>
                        <li>
                            <div className='social-media'>
                                <span><FaLinkedin  fontSize={"32px"} /></span>
                                <a href='/'>https://www.instagram.com/modyaly2152001/?next=%2F</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        
    )
}
export default UserInfo;
