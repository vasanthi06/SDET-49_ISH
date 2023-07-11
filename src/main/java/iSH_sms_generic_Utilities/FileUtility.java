package iSH_sms_generic_Utilities;

		
		

		import java.io.FileInputStream;
		import java.util.Properties;
		/**
		 *  used to read from external files like files ,text , properties
		 * @author VASANTHI.AKAVEETI
		 *
		 */
		public class FileUtility {
			
			/**
			 * used to get the filepaths from the  /config/filepath.properties  FILE
			 * @param key
			 * @return value
			 * @throws Throwable
			 */
			public String getFilePathFromPropertiesFile(String key) throws Throwable {
				FileInputStream fis = new FileInputStream("./config/filepath.properties");
				Properties pObj = new Properties();
				pObj.load(fis);
				String value = pObj.getProperty(key);
				return value;
			}
			
			 
				public String getFilePathFromPropertiesFile2(String key) throws Throwable {
					FileInputStream fis = new FileInputStream("./config/filepath.properties");
					Properties pObj = new Properties();
					pObj.load(fis);
					String value = pObj.getProperty(key);
					return value;
				}
			
			
			
			
			
			/**
			 * used to get the key : value from the any properties based on file Path parameter 
			 * @param filePath
			 * @param key
			 * @return value
			 * @throws Throwable
			 */
			public String getDataFromProperties(String filePath, String key) throws Throwable {
				FileInputStream fis = new FileInputStream(filePath);
				Properties pObj = new Properties();
				pObj.load(fis);
				String value = pObj.getProperty(key);
				return value;
			}
			
			public String getDataFromProperties2(String filePath, String key) throws Throwable {
				FileInputStream fis1 = new FileInputStream(filePath);
				Properties pObj = new Properties();
				pObj.load(fis1);
				String value = pObj.getProperty(key);
				return value;
			}

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


