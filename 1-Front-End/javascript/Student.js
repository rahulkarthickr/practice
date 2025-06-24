var student = {
    name : "Rahul",
    age : 22,
    course : "Computer Science",
    introduce : function () {
        return "Hi, I'm " + this.name + ", " + this.age + " years old, studying " + this.course + ".";
    }
}

console.log(student.introduce());