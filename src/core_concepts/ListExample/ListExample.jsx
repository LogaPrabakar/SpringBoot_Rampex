export default function ListExample(){
    const items=["Apple","Banana","Mango"];
    return<>
    <h1>List Example</h1>
    <ul>
        {items.map((item,index)=>{
            return <li>{item}</li>
})}
    </ul>
    </>
}