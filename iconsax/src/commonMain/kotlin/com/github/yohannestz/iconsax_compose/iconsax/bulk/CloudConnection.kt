package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudConnection: ImageVector
    get() {
        val current = _cloudConnection
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudConnection",
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
                moveTo(x = 19.2f, y = 14.78f)
                arcTo(horizontalEllipseRadius = 4.6f, verticalEllipseRadius = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.03f, y1 = 16.0f)
                horizontalLineTo(x = 6.37f)
                curveToRelative(dx1 = -4.07f, dy1 = -0.29f, dx2 = -4.08f, dy2 = -6.2f, dx3 = 0.0f, dy3 = -6.49f)
                horizontalLineToRelative(dx = 0.04f)
                curveToRelative(dx1 = -2.79f, dy1 = -7.76f, dx2 = 9.0f, dy2 = -10.85f, dx3 = 10.35f, dy3 = -2.7f)
                curveToRelative(dx1 = 3.77f, dy1 = 0.47f, dx2 = 5.3f, dy2 = 5.48f, dx3 = 2.44f, dy3 = 7.97f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.75f, y = 21.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 21.75f)
                horizontalLineToRelative(dx = -4.0f)
                quadToRelative(dx1 = -0.07f, dy1 = 0.0f, dx2 = -0.14f, dy2 = -0.02f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 23.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.86f, dy1 = -1.27f)
                quadToRelative(dx1 = -0.07f, dy1 = 0.02f, dx2 = -0.14f, dy2 = 0.02f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 20.25f, x2 = 6.0f, y2 = 20.25f)
                horizontalLineToRelative(dx = 4.0f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.0f, dx2 = 0.14f, dy2 = 0.02f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.13f, dy1 = -1.13f)
                quadToRelative(dx1 = -0.02f, dy1 = -0.07f, dx2 = -0.02f, dy2 = -0.14f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = 3.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.07f, dx2 = -0.02f, dy2 = 0.14f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.13f, dy1 = 1.13f)
                quadToRelative(dx1 = 0.07f, dy1 = -0.02f, dx2 = 0.14f, dy2 = -0.02f)
                horizontalLineToRelative(dx = 4.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.75f, y1 = 21.0f)
            }
        }.build().also { _cloudConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudConnection: ImageVector? = null
