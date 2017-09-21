/*
 * Created by 小陈 on 2017/9/2.
 * 复制不同类型的数据
 */
function valueToCopy (valueBeCopy) {
    var copyValue;
    if (typeof (+valueBeCopy) === 'number' && typeof valueBeCopy !== 'object') {
        copyValue = +valueBeCopy;
    } else if (typeof valueBeCopy === 'string') {
        copyValue = parseInt(copyValue);
    } else if (typeof valueBeCopy === 'object'){
        if(Array.isArray(valueBeCopy)) {
            copyValue = valueBeCopy.slice();
        }
        copyValue = JSON.parse(JSON.stringify(valueBeCopy))
    }
    copyValue = valueBeCopy;
    // console.log(copyValue)
    return copyValue;
}
//用JS 基础类型 ( function, boolean, array, number, string, object) 进行测试
var obj={
    a:'a',
    b:'b',
    c:{
        ac:'ac',
        bc:'bc'
    }
};
var obj1=valueToCopy(obj);
console.log(obj1);
console.log(obj1==obj);