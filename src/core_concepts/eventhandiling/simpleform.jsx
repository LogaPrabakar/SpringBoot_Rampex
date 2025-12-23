export default function Simpleform(){
const handleSubmit=(event)=>{
    event.preventDefault();
    console.log(event.target.name.value);
    console.log(event.target.email.value);

}

    return<>
    <h1>Sample Form</h1>
    <form onSubmit={handleSubmit}>
        <input type="text" name="name" placeholder="Enter your name"/>
        <input type="email" name="email" placeholder="Enter your email"/>
        <button>Submit</button>
    </form>
    </>
}