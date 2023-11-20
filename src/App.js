import './App.css';
import {ProfilePage,ProfileImage, Header,Container,SuggestedCourses,UserInfo,SideBar,EnrolledCourses,MutualFriends,EnrolledCP} from "./components/index"
function App() {
  return (
    <>
      
      <ProfilePage>
        <Header/>
        <SideBar/>
        <Container>
          <ProfileImage/>
          <UserInfo/>
          <EnrolledCP>
            <EnrolledCourses/>
            <MutualFriends/>
          </EnrolledCP>
          <SuggestedCourses/>
        </Container>
      </ProfilePage>
    </>
  );
}

export default App;
