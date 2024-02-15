// let str1 = "hello";
// var str2 = "hello2";

// console.log(str1);
// console.log(str2);

// str1 = "str1_변수 덮어쓰기";
// str2 = "let_변수 덮어쓰기";
// console.log(str1);
// console.log(str2);

// const str3 = "const 변수";
// console.log(str3);
// str3 = " const _ 재할당";

// const obj1 = {
//   name: " 하영",
//   age: 24,
// };
// console.log(obj1);
// obj1.name = "쭈이";
// obj1.address ="tokyo";

// const arr1 = ["dog","cat"];
// console.log(arr1);

// arr1[0] = "bird";
// arr1.push("monkey");
// console.log(arr1);

// const name = "haley";
// const age = 24;

// const message = `my name is ${name}. my age is ${age}`;
// console.log(message);

// const month = 1;
// const message = `여러분 ${sayHello()}! 지금은 ${month*2}월 입니다!`;

// function sayHello(){
//     return "Hello";
// }
// console.log(message);

// const func4 = (val1, val2) =>(
//     {
//         name : val1,
//         age : val2
//     }
// )
// console.log(func4("choco",3));

// const myProfile = {
//     name : "choco",
//     age : 6
// };
// const message = `my name is ${myProfile.name}. and my age is ${myProfile.age}.`;
// console.log(message);

// const myProfile = ["choco", 6];
// const message = `y name is ${myProfile[0]} and my age is ${myProfile[1]}`;
// const [arrName, arrage] = myProfile;
// const message3 = `his name is ${arrName} and his age is ${arrage}`;
// console.log(message3);

// const sayHello = (name) => console.log(`${name},hello!`);
// sayHello("choco");
// sayHello();

// const sayHello1 = (name = "guest") => console.log(`${name},hello!`);
// sayHello1("bro");
// sayHello1();

//스프레드 구문
// const arr1 = [1, 2];
// console.log(arr1);
// console.log(...arr1);

// const summaryFunc = (num1,num2) => console.log(num1+num2);
// summaryFunc(arr1[0],arr1[1]);
// summaryFunc(...arr1);
//---------스프레드 구문 (요소 복사와 결합)-------------
// const arr2 = [1, 2, 3, 4];
// const [num1, num2, ...arr3] = arr2;
// console.log(num1);
// console.log(num2);
// console.log(arr3);
// const arr1 = [10, 20];
// const arr2 = [30, 40];
// const arr3 = [...arr1];
// const arr4 = [...arr1, ...arr2];
// console.log(arr3);
// console.log(arr4);

//================map 사용 ===============
const nameArr = ["a", "b", "c"];
const nameArr2 = nameArr.map((name) => {
  return name;
});
console.log(...nameArr2);
nameArr.map((name) => console.log(name));
nameArr.map((name,index)=> console.log(`${index+1}번째는 ${name}입니다.`));
