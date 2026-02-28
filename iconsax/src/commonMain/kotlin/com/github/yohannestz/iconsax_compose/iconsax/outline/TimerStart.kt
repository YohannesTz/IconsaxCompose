package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimerStart: ImageVector
    get() {
        val current = _timerStart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TimerStart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 13.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 13.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 7.59f, x2 = 12.75f, y2 = 8.0f)
                verticalLineToRelative(dy = 5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 13.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 9.5f, dy1 = -9.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 20.0f, y1 = 13.66f, x2 = 20.0f, y2 = 13.25f)
                arcToRelative(a = 8.01f, b = 8.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -16.0f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.41f, dx2 = 3.59f, dy2 = 8.0f, dx3 = 8.0f, dy3 = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 3.0f, dy = -20.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 8.59f, y1 = 2.75f, x2 = 8.25f, y2 = 2.41f, x3 = 8.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 1.25f, x2 = 9.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 15.41f, y1 = 2.75f, x2 = 15.0f, y2 = 2.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.15f, y = 22.02f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.96f, dy1 = -0.25f)
                curveToRelative(dx1 = -0.66f, dy1 = -0.38f, dx2 = -1.04f, dy2 = -1.15f, dx3 = -1.04f, dy3 = -2.11f)
                verticalLineToRelative(dy = -2.31f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.96f, dx2 = 0.38f, dy2 = -1.73f, dx3 = 1.04f, dy3 = -2.11f)
                reflectiveCurveToRelative(dx1 = 1.51f, dy1 = -0.32f, dx2 = 2.34f, dy2 = 0.15f)
                lineToRelative(dx = 2.0f, dy = 1.16f)
                curveToRelative(dx1 = 0.83f, dy1 = 0.48f, dx2 = 1.31f, dy2 = 1.19f, dx3 = 1.31f, dy3 = 1.95f)
                reflectiveCurveToRelative(dx1 = -0.48f, dy1 = 1.47f, dx2 = -1.31f, dy2 = 1.95f)
                lineToRelative(dx = -2.0f, dy = 1.16f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.38f, dy1 = 0.41f)
                moveToRelative(dx = 0.01f, dy = -5.54f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.22f, dy1 = 0.05f)
                curveToRelative(dx1 = -0.18f, dy1 = 0.1f, dx2 = -0.29f, dy2 = 0.41f, dx3 = -0.29f, dy3 = 0.81f)
                verticalLineToRelative(dy = 2.31f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = 0.11f, dy2 = 0.71f, dx3 = 0.29f, dy3 = 0.81f)
                reflectiveCurveToRelative(dx1 = 0.5f, dy1 = 0.05f, dx2 = 0.84f, dy2 = -0.15f)
                lineToRelative(dx = 2.0f, dy = -1.16f)
                curveToRelative(dx1 = 0.35f, dy1 = -0.2f, dx2 = 0.56f, dy2 = -0.45f, dx3 = 0.56f, dy3 = -0.65f)
                reflectiveCurveToRelative(dx1 = -0.21f, dy1 = -0.45f, dx2 = -0.56f, dy2 = -0.65f)
                lineToRelative(dx = -2.0f, dy = -1.16f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.62f, dy1 = -0.21f)
            }
        }.build().also { _timerStart = it }
    }

@Suppress("ObjectPropertyName")
private var _timerStart: ImageVector? = null
