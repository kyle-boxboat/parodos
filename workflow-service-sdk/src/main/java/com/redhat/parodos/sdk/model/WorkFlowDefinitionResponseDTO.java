/*
 * Parodos Workflow Service API
 * This is the API documentation for the Parodos Workflow Service. It provides operations to execute assessments to determine infrastructure options (tooling + environments). Also executes infrastructure task workflows to call downstream systems to stand-up an infrastructure option.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.sdk.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.redhat.parodos.sdk.invoker.JSON;

/**
 * WorkFlowDefinitionResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkFlowDefinitionResponseDTO {

	public static final String SERIALIZED_NAME_AUTHOR = "author";

	@SerializedName(SERIALIZED_NAME_AUTHOR)
	private String author;

	public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";

	@SerializedName(SERIALIZED_NAME_CREATE_DATE)
	private Date createDate;

	public static final String SERIALIZED_NAME_ID = "id";

	@SerializedName(SERIALIZED_NAME_ID)
	private UUID id;

	public static final String SERIALIZED_NAME_MODIFY_DATE = "modifyDate";

	@SerializedName(SERIALIZED_NAME_MODIFY_DATE)
	private Date modifyDate;

	public static final String SERIALIZED_NAME_NAME = "name";

	@SerializedName(SERIALIZED_NAME_NAME)
	private String name;

	public static final String SERIALIZED_NAME_PARAMETERS = "parameters";

	@SerializedName(SERIALIZED_NAME_PARAMETERS)
	private Map<String, Map<String, Object>> parameters = new HashMap<>();

	/**
	 * Gets or Sets processingType
	 */
	@JsonAdapter(ProcessingTypeEnum.Adapter.class)
	public enum ProcessingTypeEnum {

		SEQUENTIAL("SEQUENTIAL"),

		PARALLEL("PARALLEL"),

		OTHER("OTHER");

		private String value;

		ProcessingTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static ProcessingTypeEnum fromValue(String value) {
			for (ProcessingTypeEnum b : ProcessingTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		public static class Adapter extends TypeAdapter<ProcessingTypeEnum> {

			@Override
			public void write(final JsonWriter jsonWriter, final ProcessingTypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ProcessingTypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ProcessingTypeEnum.fromValue(value);
			}

		}

	}

	public static final String SERIALIZED_NAME_PROCESSING_TYPE = "processingType";

	@SerializedName(SERIALIZED_NAME_PROCESSING_TYPE)
	private ProcessingTypeEnum processingType;

	public static final String SERIALIZED_NAME_PROPERTIES = "properties";

	@SerializedName(SERIALIZED_NAME_PROPERTIES)
	private WorkFlowPropertiesDefinitionDTO properties;

	public static final String SERIALIZED_NAME_ROLLBACK_WORKFLOW = "rollbackWorkflow";

	@SerializedName(SERIALIZED_NAME_ROLLBACK_WORKFLOW)
	private String rollbackWorkflow;

	/**
	 * Gets or Sets type
	 */
	@JsonAdapter(TypeEnum.Adapter.class)
	public enum TypeEnum {

		ASSESSMENT("ASSESSMENT"),

		CHECKER("CHECKER"),

		INFRASTRUCTURE("INFRASTRUCTURE"),

		ESCALATION("ESCALATION");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		public static class Adapter extends TypeAdapter<TypeEnum> {

			@Override
			public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TypeEnum.fromValue(value);
			}

		}

	}

	public static final String SERIALIZED_NAME_TYPE = "type";

	@SerializedName(SERIALIZED_NAME_TYPE)
	private TypeEnum type;

	public static final String SERIALIZED_NAME_WORKS = "works";

	@SerializedName(SERIALIZED_NAME_WORKS)
	private List<WorkDefinitionResponseDTO> works = new ArrayList<>();

	public WorkFlowDefinitionResponseDTO() {
	}

	public WorkFlowDefinitionResponseDTO author(String author) {

		this.author = author;
		return this;
	}

	/**
	 * Get author
	 * @return author
	 **/
	@javax.annotation.Nullable

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WorkFlowDefinitionResponseDTO createDate(Date createDate) {

		this.createDate = createDate;
		return this;
	}

	/**
	 * Get createDate
	 * @return createDate
	 **/
	@javax.annotation.Nullable

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public WorkFlowDefinitionResponseDTO id(UUID id) {

		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * @return id
	 **/
	@javax.annotation.Nullable

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public WorkFlowDefinitionResponseDTO modifyDate(Date modifyDate) {

		this.modifyDate = modifyDate;
		return this;
	}

	/**
	 * Get modifyDate
	 * @return modifyDate
	 **/
	@javax.annotation.Nullable

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public WorkFlowDefinitionResponseDTO name(String name) {

		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * @return name
	 **/
	@javax.annotation.Nullable

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkFlowDefinitionResponseDTO parameters(Map<String, Map<String, Object>> parameters) {

		this.parameters = parameters;
		return this;
	}

	public WorkFlowDefinitionResponseDTO putParametersItem(String key, Map<String, Object> parametersItem) {
		if (this.parameters == null) {
			this.parameters = new HashMap<>();
		}
		this.parameters.put(key, parametersItem);
		return this;
	}

	/**
	 * Get parameters
	 * @return parameters
	 **/
	@javax.annotation.Nullable

	public Map<String, Map<String, Object>> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Map<String, Object>> parameters) {
		this.parameters = parameters;
	}

	public WorkFlowDefinitionResponseDTO processingType(ProcessingTypeEnum processingType) {

		this.processingType = processingType;
		return this;
	}

	/**
	 * Get processingType
	 * @return processingType
	 **/
	@javax.annotation.Nullable

	public ProcessingTypeEnum getProcessingType() {
		return processingType;
	}

	public void setProcessingType(ProcessingTypeEnum processingType) {
		this.processingType = processingType;
	}

	public WorkFlowDefinitionResponseDTO properties(WorkFlowPropertiesDefinitionDTO properties) {

		this.properties = properties;
		return this;
	}

	/**
	 * Get properties
	 * @return properties
	 **/
	@javax.annotation.Nullable

	public WorkFlowPropertiesDefinitionDTO getProperties() {
		return properties;
	}

	public void setProperties(WorkFlowPropertiesDefinitionDTO properties) {
		this.properties = properties;
	}

	public WorkFlowDefinitionResponseDTO rollbackWorkflow(String rollbackWorkflow) {

		this.rollbackWorkflow = rollbackWorkflow;
		return this;
	}

	/**
	 * Get rollbackWorkflow
	 * @return rollbackWorkflow
	 **/
	@javax.annotation.Nullable

	public String getRollbackWorkflow() {
		return rollbackWorkflow;
	}

	public void setRollbackWorkflow(String rollbackWorkflow) {
		this.rollbackWorkflow = rollbackWorkflow;
	}

	public WorkFlowDefinitionResponseDTO type(TypeEnum type) {

		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * @return type
	 **/
	@javax.annotation.Nullable

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public WorkFlowDefinitionResponseDTO works(List<WorkDefinitionResponseDTO> works) {

		this.works = works;
		return this;
	}

	public WorkFlowDefinitionResponseDTO addWorksItem(WorkDefinitionResponseDTO worksItem) {
		if (this.works == null) {
			this.works = new ArrayList<>();
		}
		this.works.add(worksItem);
		return this;
	}

	/**
	 * Get works
	 * @return works
	 **/
	@javax.annotation.Nullable

	public List<WorkDefinitionResponseDTO> getWorks() {
		return works;
	}

	public void setWorks(List<WorkDefinitionResponseDTO> works) {
		this.works = works;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkFlowDefinitionResponseDTO workFlowDefinitionResponseDTO = (WorkFlowDefinitionResponseDTO) o;
		return Objects.equals(this.author, workFlowDefinitionResponseDTO.author)
				&& Objects.equals(this.createDate, workFlowDefinitionResponseDTO.createDate)
				&& Objects.equals(this.id, workFlowDefinitionResponseDTO.id)
				&& Objects.equals(this.modifyDate, workFlowDefinitionResponseDTO.modifyDate)
				&& Objects.equals(this.name, workFlowDefinitionResponseDTO.name)
				&& Objects.equals(this.parameters, workFlowDefinitionResponseDTO.parameters)
				&& Objects.equals(this.processingType, workFlowDefinitionResponseDTO.processingType)
				&& Objects.equals(this.properties, workFlowDefinitionResponseDTO.properties)
				&& Objects.equals(this.rollbackWorkflow, workFlowDefinitionResponseDTO.rollbackWorkflow)
				&& Objects.equals(this.type, workFlowDefinitionResponseDTO.type)
				&& Objects.equals(this.works, workFlowDefinitionResponseDTO.works);
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, createDate, id, modifyDate, name, parameters, processingType, properties,
				rollbackWorkflow, type, works);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkFlowDefinitionResponseDTO {\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
		sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
		sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
		sb.append("    rollbackWorkflow: ").append(toIndentedString(rollbackWorkflow)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    works: ").append(toIndentedString(works)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the
	 * first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public static HashSet<String> openapiFields;

	public static HashSet<String> openapiRequiredFields;

	static {
		// a set of all properties/fields (JSON key names)
		openapiFields = new HashSet<String>();
		openapiFields.add("author");
		openapiFields.add("createDate");
		openapiFields.add("id");
		openapiFields.add("modifyDate");
		openapiFields.add("name");
		openapiFields.add("parameters");
		openapiFields.add("processingType");
		openapiFields.add("properties");
		openapiFields.add("rollbackWorkflow");
		openapiFields.add("type");
		openapiFields.add("works");

		// a set of required properties/fields (JSON key names)
		openapiRequiredFields = new HashSet<String>();
	}

	/**
	 * Validates the JSON Object and throws an exception if issues found
	 * @param jsonObj JSON Object
	 * @throws IOException if the JSON Object is invalid with respect to
	 * WorkFlowDefinitionResponseDTO
	 */
	public static void validateJsonObject(JsonObject jsonObj) throws IOException {
		if (jsonObj == null) {
			if (!WorkFlowDefinitionResponseDTO.openapiRequiredFields.isEmpty()) { // has
																					// required
																					// fields
																					// but
																					// JSON
																					// object
																					// is
																					// null
				throw new IllegalArgumentException(String.format(
						"The required field(s) %s in WorkFlowDefinitionResponseDTO is not found in the empty JSON string",
						WorkFlowDefinitionResponseDTO.openapiRequiredFields.toString()));
			}
		}

		Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
		// check to see if the JSON string contains additional fields
		for (Entry<String, JsonElement> entry : entries) {
			if (!WorkFlowDefinitionResponseDTO.openapiFields.contains(entry.getKey())) {
				throw new IllegalArgumentException(String.format(
						"The field `%s` in the JSON string is not defined in the `WorkFlowDefinitionResponseDTO` properties. JSON: %s",
						entry.getKey(), jsonObj.toString()));
			}
		}
		if ((jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull())
				&& !jsonObj.get("author").isJsonPrimitive()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`",
							jsonObj.get("author").toString()));
		}
		if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`",
							jsonObj.get("id").toString()));
		}
		if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
				&& !jsonObj.get("name").isJsonPrimitive()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`",
							jsonObj.get("name").toString()));
		}
		if ((jsonObj.get("processingType") != null && !jsonObj.get("processingType").isJsonNull())
				&& !jsonObj.get("processingType").isJsonPrimitive()) {
			throw new IllegalArgumentException(String.format(
					"Expected the field `processingType` to be a primitive type in the JSON string but got `%s`",
					jsonObj.get("processingType").toString()));
		}
		// validate the optional field `properties`
		if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
			WorkFlowPropertiesDefinitionDTO.validateJsonObject(jsonObj.getAsJsonObject("properties"));
		}
		if ((jsonObj.get("rollbackWorkflow") != null && !jsonObj.get("rollbackWorkflow").isJsonNull())
				&& !jsonObj.get("rollbackWorkflow").isJsonPrimitive()) {
			throw new IllegalArgumentException(String.format(
					"Expected the field `rollbackWorkflow` to be a primitive type in the JSON string but got `%s`",
					jsonObj.get("rollbackWorkflow").toString()));
		}
		if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
				&& !jsonObj.get("type").isJsonPrimitive()) {
			throw new IllegalArgumentException(
					String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`",
							jsonObj.get("type").toString()));
		}
		if (jsonObj.get("works") != null && !jsonObj.get("works").isJsonNull()) {
			JsonArray jsonArrayworks = jsonObj.getAsJsonArray("works");
			if (jsonArrayworks != null) {
				// ensure the json data is an array
				if (!jsonObj.get("works").isJsonArray()) {
					throw new IllegalArgumentException(
							String.format("Expected the field `works` to be an array in the JSON string but got `%s`",
									jsonObj.get("works").toString()));
				}

				// validate the optional field `works` (array)
				for (int i = 0; i < jsonArrayworks.size(); i++) {
					WorkDefinitionResponseDTO.validateJsonObject(jsonArrayworks.get(i).getAsJsonObject());
				}
				;
			}
		}
	}

	public static class CustomTypeAdapterFactory implements TypeAdapterFactory {

		@SuppressWarnings("unchecked")
		@Override
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
			if (!WorkFlowDefinitionResponseDTO.class.isAssignableFrom(type.getRawType())) {
				return null; // this class only serializes 'WorkFlowDefinitionResponseDTO'
								// and its subtypes
			}
			final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
			final TypeAdapter<WorkFlowDefinitionResponseDTO> thisAdapter = gson.getDelegateAdapter(this,
					TypeToken.get(WorkFlowDefinitionResponseDTO.class));

			return (TypeAdapter<T>) new TypeAdapter<WorkFlowDefinitionResponseDTO>() {
				@Override
				public void write(JsonWriter out, WorkFlowDefinitionResponseDTO value) throws IOException {
					JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
					elementAdapter.write(out, obj);
				}

				@Override
				public WorkFlowDefinitionResponseDTO read(JsonReader in) throws IOException {
					JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
					validateJsonObject(jsonObj);
					return thisAdapter.fromJsonTree(jsonObj);
				}

			}.nullSafe();
		}

	}

	/**
	 * Create an instance of WorkFlowDefinitionResponseDTO given an JSON string
	 * @param jsonString JSON string
	 * @return An instance of WorkFlowDefinitionResponseDTO
	 * @throws IOException if the JSON string is invalid with respect to
	 * WorkFlowDefinitionResponseDTO
	 */
	public static WorkFlowDefinitionResponseDTO fromJson(String jsonString) throws IOException {
		return JSON.getGson().fromJson(jsonString, WorkFlowDefinitionResponseDTO.class);
	}

	/**
	 * Convert an instance of WorkFlowDefinitionResponseDTO to an JSON string
	 * @return JSON string
	 */
	public String toJson() {
		return JSON.getGson().toJson(this);
	}

}
