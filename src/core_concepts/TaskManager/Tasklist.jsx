export default function Tasklist({tasks}){
    return<ul>
    {tasks.map((task)=>
        <li>{task['text']}</li>
    )}
    </ul>
}