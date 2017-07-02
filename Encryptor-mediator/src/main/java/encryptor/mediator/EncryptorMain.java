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

public class EncryptorMain {

	public static void main(String[] args) {
		try{
			EncryptorAES aes = new EncryptorAES();
			String result = aes.encrypt("hello");
			String secretKey = aes.getSecretKey();
			String ivBytes = aes.getIVBytes();
			System.out.println("Encrypting "+ result);
			System.out.println("Secret key "+ secretKey);
			System.out.println("Decrypting "+ aes.decrypt(result,secretKey,ivBytes));

		} catch (NoSuchAlgorithmException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (InvalidKeyException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (IllegalBlockSizeException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (BadPaddingException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (NoSuchPaddingException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (UnsupportedEncodingException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (InvalidAlgorithmParameterException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (InvalidParameterSpecException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		} catch (DecoderException e) {
			EncryptorExceptionHandler.createErrorMessage(e);
		}
	}

}
