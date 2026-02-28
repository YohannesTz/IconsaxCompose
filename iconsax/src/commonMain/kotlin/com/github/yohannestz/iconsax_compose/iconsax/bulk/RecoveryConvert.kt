package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RecoveryConvert: ImageVector
    get() {
        val current = _recoveryConvert
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RecoveryConvert",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.64f, dy1 = -1.14f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.29f, dy1 = 0.77f)
                lineToRelative(dx = -0.27f, dy = 0.45f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.83f, dy1 = -6.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.74f, dx3 = 0.75f, dy3 = -0.74f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                arcTo(horizontalEllipseRadius = 7.8f, verticalEllipseRadius = 7.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 22.75f)
                moveToRelative(dx = -13.0f, dy = -13.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 9.0f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 1.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.64f, dy1 = 1.14f)
                lineTo(x = 8.59f, y = 4.14f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = 0.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = -1.03f)
                lineToRelative(dx = 0.27f, dy = -0.45f)
                arcTo(horizontalEllipseRadius = 6.26f, verticalEllipseRadius = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.75f, y1 = 9.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 9.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 14.8f, y = 12.63f)
                verticalLineToRelative(dy = 2.94f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.45f, dx2 = -0.98f, dy2 = 3.43f, dx3 = -3.43f, dy3 = 3.43f)
                horizontalLineTo(x = 8.43f)
                curveTo(x1 = 5.98f, y1 = 19.0f, x2 = 5.0f, y2 = 18.02f, x3 = 5.0f, y3 = 15.57f)
                verticalLineToRelative(dy = -2.94f)
                curveTo(x1 = 5.0f, y1 = 10.18f, x2 = 5.98f, y2 = 9.2f, x3 = 8.43f, y3 = 9.2f)
                horizontalLineToRelative(dx = 2.94f)
                curveToRelative(dx1 = 2.45f, dy1 = 0.0f, dx2 = 3.43f, dy2 = 0.98f, dx3 = 3.43f, dy3 = 3.43f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.57f, y = 5.0f)
                horizontalLineToRelative(dx = -2.94f)
                curveToRelative(dx1 = -2.41f, dy1 = 0.0f, dx2 = -3.39f, dy2 = 0.96f, dx3 = -3.42f, dy3 = 3.32f)
                horizontalLineToRelative(dx = 2.16f)
                curveToRelative(dx1 = 2.94f, dy1 = 0.0f, dx2 = 4.3f, dy2 = 1.37f, dx3 = 4.3f, dy3 = 4.3f)
                verticalLineToRelative(dy = 2.16f)
                curveToRelative(dx1 = 2.37f, dy1 = -0.03f, dx2 = 3.32f, dy2 = -1.01f, dx3 = 3.32f, dy3 = -3.42f)
                verticalLineTo(y = 8.43f)
                curveTo(x1 = 19.0f, y1 = 5.98f, x2 = 18.02f, y2 = 5.0f, x3 = 15.57f, y3 = 5.0f)
            }
        }.build().also { _recoveryConvert = it }
    }

@Suppress("ObjectPropertyName")
private var _recoveryConvert: ImageVector? = null
