/*
 * Created by С�� on 2017/9/2.
 * ���Ʋ�ͬ���͵�����
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
//��JS �������� ( function, boolean, array, number, string, object) ���в���
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