import { useState }from  "react";

export default function Stateexam(){
    const [count,setCount]=useState (0);

    const Handclick=() =>{
        setCount(count+1);
    }
    return<>
    <h1>hello state</h1>
    <h3>Counter {count}</h3>
    {/* <button onClick={()=>setCount(count+1)}>Increment</button> */}
    <button onClick={Handclick}>Increment</button>
    </>
}