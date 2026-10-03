import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable

def response = WS.sendRequestAndVerify(
    findTestObject('Pet/PUT_Update_Pet')
)

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(
    response,
    'id',
    GlobalVariable.petId
)

WS.verifyElementPropertyValue(
    response,
    'name',
    'Bobby Updated'
)

WS.verifyElementPropertyValue(
    response,
    'status',
    'sold'
)
