package encryptor.mediator;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidParameterSpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.DecoderException;

public class EncryptorExceptionHandler {

	public static String createErrorMessage(NoSuchAlgorithmException e) {
		return "EncryptorMediator algorithm error occured: " + e.getMessage();
	}
	
	public static String createErrorMessage(InvalidKeyException e) {
		return "EncryptorMediator key error occured: " + e.getMessage();
	}
	
	public static String createErrorMessage(IllegalBlockSizeException e) {
		return "EncryptorMediator illegal block size error occured: " + e.getMessage();
	}

	public static String createErrorMessage(BadPaddingException e) {
		return "EncryptorMediator padding error occured: " + e.getMessage();
	}

	public static String createErrorMessage(NoSuchPaddingException e) {
		return "EncryptorMediator padding error occured: " + e.getMessage();
	}

	public static String createErrorMessage(UnsupportedEncodingException e) {
		return "EncryptorMediator encoding error occured: " + e.getMessage();
	}

	public static String createErrorMessage(InvalidAlgorithmParameterException e) {
		return "EncryptorMediator algorithm error occured: " + e.getMessage();
	}

	public static String createErrorMessage(InvalidParameterSpecException e) {
		return "EncryptorMediator parameter error occured: " + e.getMessage();
	}

	public static String createErrorMessage(DecoderException e) {
		return "EncryptorMediator key error occured: " + e.getMessage();
	}
}
