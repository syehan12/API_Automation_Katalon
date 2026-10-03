import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable

def response = WS.sendRequestAndVerify(
    findTestObject(
        'Pet/DELETE_Pet',
        [
            ('petId'): GlobalVariable.petId
        ]
    )
)

WS.verifyResponseStatusCode(response, 200)
