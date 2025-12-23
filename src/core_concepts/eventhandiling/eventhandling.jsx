import { useState } from "react";

export default function Eventhandling(){
    const[message,setMessage]=useState("");
    const handiling=(event)=>{
        setMessage(event.target.value);
    }
    return<>
    <h1>Event handiling example</h1>
    {/* <input type="text" placeholder="Enter your message" onChange={(event)=>setMessage(event.target.value)}/> */}
    <input type="text" onChange={handiling} placeholder="Text me"/>
    <p>{message}</p>
    </>

    }