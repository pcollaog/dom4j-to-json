package com.symbiose.serializer.json;

import net.sf.json.JSONObject;

/**
 * @author pcollaog
 *
 */
public interface JSONObjectWrapper {

	/**
	 * @return
	 */
	String wrapperToString();

	/**
	 * 
	 * @return
	 */
	String getKey();

	/**
	 * @return
	 */
	Object getValue();

	/**
	 * @return
	 */
	JSONObjectWrapper buildJsonArray();

	/**
	 * @param recursive
	 */
	void accumulate(JSONObjectWrapper recursive);

	/**
	 * @return
	 */
	JSONObject getJsonObject();

}