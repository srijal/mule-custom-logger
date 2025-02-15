package com.avioconsulting.mule.logger.internal;

import com.avioconsulting.mule.logger.internal.config.CustomLoggerConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

/**
 * This is the main class of an extension, is the entry point from which
 * configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "argano-logger")
@Extension(name = "ARGANO Logger")
@Configurations(CustomLoggerConfiguration.class)
public class CustomLoggerExtension {

}
