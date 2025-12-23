import { useState } from "react";

export default function Taskform({addtask}){
    const[value,setvalue]=useState("");

    const handSubmit=(event)=>{
        // event.preventDefault();
        if(value.trim()){
        console.log("form submitted",value);
        addtask(value);
        setvalue("");
        }
    }
    return(
        <div>
        <form action={handSubmit}>
        <input type="text" onChange={(e)=>setvalue(e.target.value)} placeholder="Enter task"/>
        <button type="Submit">Add Task</button>
        value={value}
        </form>
        </div>
    );
}