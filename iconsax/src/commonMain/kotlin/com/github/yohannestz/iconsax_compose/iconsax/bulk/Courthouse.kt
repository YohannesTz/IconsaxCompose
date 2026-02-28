package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Courthouse: ImageVector
    get() {
        val current = _courthouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Courthouse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.42f, y = 1.38f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = -0.08f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.44f, dy1 = 0.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.7f, dy1 = 0.08f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.25f, y1 = 2.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 8.41f, x2 = 12.75f, y2 = 8.0f)
                verticalLineTo(y = 6.02f)
                arcToRelative(a = 7.4f, b = 7.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.53f, dy1 = -0.32f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = -0.7f)
                verticalLineTo(y = 2.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.33f, dy1 = -0.62f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 21.25f)
                horizontalLineToRelative(dx = -1.25f)
                verticalLineTo(y = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = -1.33f, dy2 = -3.75f, dx3 = -3.75f, dy3 = -3.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = 1.33f, dx3 = -3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 10.25f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 22.75f, x2 = 2.0f, y2 = 22.75f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
                moveToRelative(dx = -2.75f, dy = -8.5f)
                verticalLineToRelative(dy = 8.5f)
                horizontalLineToRelative(dx = -2.51f)
                verticalLineToRelative(dy = -8.5f)
                close()
                moveToRelative(dx = -8.01f, dy = 8.5f)
                horizontalLineToRelative(dx = -2.5f)
                verticalLineToRelative(dy = -8.5f)
                horizontalLineToRelative(dx = 2.5f)
                close()
                moveToRelative(dx = 1.5f, dy = -8.5f)
                horizontalLineToRelative(dx = 2.5f)
                verticalLineToRelative(dy = 8.5f)
                horizontalLineToRelative(dx = -2.5f)
                close()
                moveToRelative(dx = -7.99f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.49f)
                verticalLineToRelative(dy = 8.5f)
                horizontalLineTo(x = 4.75f)
                close()
            }
        }.build().also { _courthouse = it }
    }

@Suppress("ObjectPropertyName")
private var _courthouse: ImageVector? = null
