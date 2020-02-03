/**
 * /* -------------------------
 * 
 * MIT License
 * 
 * Copyright (c) 2018, Schneider Electric USA, Inc.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * ---------------------
 */


/*
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen Do not edit the class manually.
 */
package semanticstore.ontology.library.generator.api.interfaces;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Generated;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Generated(value = "io.swagger.codegen.languages.java.SpringCodegen",
    date = "2018-08-08T17:06:42.836-04:00[America/New_York]")
@RequestMapping("generate")
public interface GeneratorApi {

  @ApiOperation(value = "Requests Generation of Code based on an ontology model",
      nickname = "generate",
      notes = "By passing in the appropriate options, you can generate a library for CSharp, Java or Python of your ontology model",
      response = byte[].class)
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "OLGA Generated Llibrary Successfully",
          response = byte[].class),
      @ApiResponse(code = 400, message = "invalid input, object invalid")})
  @RequestMapping(method = RequestMethod.POST, produces = "application/zip",
      consumes = { "application/xml","application/rdf+xml","application/x-turtle","text/turtle" })
  public byte[] generate(@RequestParam(value = "code", required = true) String code,
      @RequestParam(value = "name", required = true) String name,
      @RequestParam(value = "library", required = true) String library,
      @RequestParam(value = "preserve", required = false, defaultValue = "false") String preserve,
      @RequestParam(value = "version", required = false) String version,
      @RequestParam(value = "partial", required = false, defaultValue = "false") String partial,
      @RequestParam(value = "skipCompile", required = false,
          defaultValue = "false") boolean skipCompile,
      @ApiParam(value = "OLGA input parameters") @Valid @RequestBody String body,
      HttpServletResponse response) throws Exception;
}
