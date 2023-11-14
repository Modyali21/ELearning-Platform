import './App.css';
import { Signup } from './components/Signup';
import {BroweserRouter as Router,Route,Routes} from "react-router-dom"
import {ProfileImage} from  "./components/ProfileImage"
function App() {
  return (
    <>
      <Signup />
      {/* <ProfileImage/> */}
    </>
  );
}

export default App;
