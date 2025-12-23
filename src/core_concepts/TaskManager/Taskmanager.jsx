import { useState } from "react";
import Taskform from "./Taskform";
import Tasklist from "./Tasklist";


export default function Taskmanager(){
    const [tasks,setTasks]=useState([]);

    const addtask=(text)=>{
        const newTasks={id:Date.now(),text,completed:false};
        setTasks([...tasks,newTasks]);
    }
    return(
        <div>
            <h1>Task Manager</h1>
            {/* <p> Start Adding your text</p> */}
            <Taskform addtask={addtask}/>
            <Tasklist tasks={tasks}/>
            <p>task:{tasks.length}</p>

        </div>
    )
}