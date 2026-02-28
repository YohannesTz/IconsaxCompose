package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gemini: ImageVector
    get() {
        val current = _gemini
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Gemini",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 5.53f)
                curveToRelative(dx1 = -3.59f, dy1 = 0.0f, dx2 = -7.18f, dy2 = -0.96f, dx3 = -10.39f, dy3 = -2.88f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = -1.03f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.03f, dy1 = -0.26f)
                arcToRelative(a = 18.7f, b = 18.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 19.23f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.77f, dy1 = 1.29f)
                arcTo(horizontalEllipseRadius = 20.0f, verticalEllipseRadius = 20.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.53f)
                moveToRelative(dx = 10.0f, dy = 17.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.39f, dy1 = -0.11f)
                arcToRelative(a = 18.7f, b = 18.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -19.23f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -0.77f, dy1 = -1.3f)
                arcToRelative(a = 20.2f, b = 20.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 20.77f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.26f, dy1 = 1.04f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.64f, dy1 = 0.37f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.33f, y = 21.16f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = -1.11f)
                arcTo(horizontalEllipseRadius = 16.9f, verticalEllipseRadius = 16.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.76f, y1 = 4.17f)
                lineTo(x = 4.64f, y = 3.93f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.32f, dy1 = -1.01f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = 0.32f)
                lineToRelative(dx = 0.12f, dy = 0.24f)
                arcToRelative(a = 18.4f, b = 18.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = 17.29f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = 0.39f)
                moveToRelative(dx = 13.34f, dy = 0.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = -0.39f)
                arcToRelative(a = 18.4f, b = 18.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.1f, dy1 = -17.29f)
                lineToRelative(dx = 0.12f, dy = -0.24f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.33f, dy1 = 0.69f)
                lineToRelative(dx = -0.12f, dy = 0.24f)
                arcToRelative(a = 16.9f, b = 16.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.1f, dy1 = 15.88f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = 1.11f)
            }
        }.build().also { _gemini = it }
    }

@Suppress("ObjectPropertyName")
private var _gemini: ImageVector? = null
