package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ontology: ImageVector
    get() {
        val current = _ontology
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ontology",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.9f, y = 19.68f)
                arcTo(horizontalEllipseRadius = 9.4f, verticalEllipseRadius = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.42f, y1 = 22.0f)
                curveToRelative(dx1 = -5.17f, dy1 = -0.14f, dx2 = -9.2f, dy2 = -4.6f, dx3 = -9.2f, dy3 = -9.76f)
                verticalLineTo(y = 5.2f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.85f, dy1 = -0.35f)
                close()
                moveTo(x = 6.22f, y = 4.3f)
                arcTo(horizontalEllipseRadius = 9.3f, verticalEllipseRadius = 9.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.65f, y1 = 2.0f)
                curveToRelative(dx1 = 5.13f, dy1 = 0.14f, dx2 = 9.12f, dy2 = 4.55f, dx3 = 9.12f, dy3 = 9.68f)
                verticalLineToRelative(dy = 6.96f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.85f, dy1 = 0.35f)
                close()
            }
        }.build().also { _ontology = it }
    }

@Suppress("ObjectPropertyName")
private var _ontology: ImageVector? = null
