package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 11.7f, y = 22.75f)
                horizontalLineToRelative(dx = -0.29f)
                curveToRelative(dx1 = -5.48f, dy1 = -0.15f, dx2 = -9.93f, dy2 = -4.87f, dx3 = -9.93f, dy3 = -10.51f)
                verticalLineTo(y = 5.21f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.13f, dy1 = -0.88f)
                lineToRelative(dx = 14.83f, dy = 14.83f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.04f, dy1 = 1.1f)
                arcToRelative(a = 10.2f, b = 10.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.7f, dy1 = 2.49f)
                moveTo(x = 2.98f, y = 5.81f)
                verticalLineToRelative(dy = 6.43f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.84f, dx2 = 3.8f, dy2 = 8.88f, dx3 = 8.47f, dy3 = 9.01f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.33f, dy1 = -1.63f)
                close()
                moveToRelative(dx = 18.29f, dy = 14.1f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = -0.38f)
                lineTo(x = 5.69f, y = 4.83f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.04f, dy1 = -1.1f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.94f, dy1 = -2.48f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.15f, dx2 = 9.85f, dy2 = 4.83f, dx3 = 9.85f, dy3 = 10.43f)
                verticalLineToRelative(dy = 6.96f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.51f, dx2 = -0.3f, dy2 = 0.96f, dx3 = -0.77f, dy3 = 1.15f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.48f, dy1 = 0.11f)
                moveTo(x = 7.35f, y = 4.36f)
                lineToRelative(dx = 13.68f, dy = 13.68f)
                verticalLineTo(y = 11.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.79f, dx2 = -3.77f, dy2 = -8.8f, dx3 = -8.4f, dy3 = -8.93f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.28f, dy1 = 1.61f)
            }
        }.build().also { _ontology = it }
    }

@Suppress("ObjectPropertyName")
private var _ontology: ImageVector? = null
