package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Medal: ImageVector
    get() {
        val current = _medal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Medal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.75f)
                curveToRelative(dx1 = -4.14f, dy1 = 0.0f, dx2 = -7.5f, dy2 = -3.25f, dx3 = -7.5f, dy3 = -7.25f)
                reflectiveCurveTo(x1 = 7.86f, y1 = 1.25f, x2 = 12.0f, y2 = 1.25f)
                reflectiveCurveToRelative(dx1 = 7.5f, dy1 = 3.25f, dx2 = 7.5f, dy2 = 7.25f)
                reflectiveCurveToRelative(dx1 = -3.36f, dy1 = 7.25f, dx2 = -7.5f, dy2 = 7.25f)
                moveToRelative(dx = 0.0f, dy = -13.0f)
                curveToRelative(dx1 = -3.31f, dy1 = 0.0f, dx2 = -6.0f, dy2 = 2.58f, dx3 = -6.0f, dy3 = 5.75f)
                reflectiveCurveToRelative(dx1 = 2.69f, dy1 = 5.75f, dx2 = 6.0f, dy2 = 5.75f)
                reflectiveCurveToRelative(dx1 = 6.0f, dy1 = -2.58f, dx2 = 6.0f, dy2 = -5.75f)
                reflectiveCurveToRelative(dx1 = -2.69f, dy1 = -5.75f, dx2 = -6.0f, dy2 = -5.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.62f, y = 22.75f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.85f, dy1 = -0.2f)
                lineToRelative(dx = -2.69f, dy = -1.27f)
                horizontalLineTo(x = 11.9f)
                lineToRelative(dx = -2.67f, dy = 1.26f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.69f, dy1 = -0.04f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = -1.61f)
                lineToRelative(dx = 0.01f, dy = -7.38f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.32f, dy2 = -0.77f, dx3 = 0.75f, dy3 = -0.75f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
                lineToRelative(dx = -0.01f, dy = 7.38f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.22f, dx2 = 0.06f, dy2 = 0.33f, dx3 = 0.09f, dy3 = 0.34f)
                curveToRelative(dx1 = 0.02f, dy1 = 0.0f, dx2 = 0.11f, dy2 = 0.02f, dx3 = 0.25f, dy3 = -0.05f)
                lineToRelative(dx = 2.68f, dy = -1.27f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.45f, dy1 = 0.0f)
                lineToRelative(dx = 2.69f, dy = 1.27f)
                curveToRelative(dx1 = 0.14f, dy1 = 0.07f, dx2 = 0.23f, dy2 = 0.06f, dx3 = 0.25f, dy3 = 0.05f)
                curveToRelative(dx1 = 0.03f, dy1 = -0.02f, dx2 = 0.09f, dy2 = -0.13f, dx3 = 0.09f, dy3 = -0.34f)
                verticalLineToRelative(dy = -7.56f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 7.56f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = -0.29f, dy2 = 1.29f, dx3 = -0.79f, dy3 = 1.6f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.85f, dy1 = 0.26f)
            }
        }.build().also { _medal = it }
    }

@Suppress("ObjectPropertyName")
private var _medal: ImageVector? = null
