package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CpuCharge: ImageVector
    get() {
        val current = _cpuCharge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CpuCharge",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.4f, y = 20.75f)
                horizontalLineTo(x = 9.6f)
                curveToRelative(dx1 = -4.39f, dy1 = 0.0f, dx2 = -6.35f, dy2 = -1.96f, dx3 = -6.35f, dy3 = -6.35f)
                verticalLineTo(y = 9.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.39f, dx2 = 1.96f, dy2 = -6.35f, dx3 = 6.35f, dy3 = -6.35f)
                horizontalLineToRelative(dx = 4.8f)
                curveToRelative(dx1 = 4.39f, dy1 = 0.0f, dx2 = 6.35f, dy2 = 1.96f, dx3 = 6.35f, dy3 = 6.35f)
                verticalLineToRelative(dy = 4.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.39f, dx2 = -1.96f, dy2 = 6.35f, dx3 = -6.35f, dy3 = 6.35f)
                moveToRelative(dx = -4.8f, dy = -16.0f)
                curveToRelative(dx1 = -3.58f, dy1 = 0.0f, dx2 = -4.85f, dy2 = 1.27f, dx3 = -4.85f, dy3 = 4.85f)
                verticalLineToRelative(dy = 4.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.58f, dx2 = 1.27f, dy2 = 4.85f, dx3 = 4.85f, dy3 = 4.85f)
                horizontalLineToRelative(dx = 4.8f)
                curveToRelative(dx1 = 3.58f, dy1 = 0.0f, dx2 = 4.85f, dy2 = -1.27f, dx3 = 4.85f, dy3 = -4.85f)
                verticalLineTo(y = 9.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.58f, dx2 = -1.27f, dy2 = -4.85f, dx3 = -4.85f, dy3 = -4.85f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.5f, y = 17.75f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -2.9f, dy1 = 0.0f, dx2 = -4.25f, dy2 = -1.35f, dx3 = -4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.9f, dx2 = 1.35f, dy2 = -4.25f, dx3 = 4.25f, dy3 = -4.25f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.9f, dy1 = 0.0f, dx2 = 4.25f, dy2 = 1.35f, dx3 = 4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.9f, dx2 = -1.35f, dy2 = 4.25f, dx3 = -4.25f, dy3 = 4.25f)
                moveToRelative(dx = -3.0f, dy = -10.0f)
                curveToRelative(dx1 = -2.08f, dy1 = 0.0f, dx2 = -2.75f, dy2 = 0.67f, dx3 = -2.75f, dy3 = 2.75f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.08f, dx2 = 0.67f, dy2 = 2.75f, dx3 = 2.75f, dy3 = 2.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 2.08f, dy1 = 0.0f, dx2 = 2.75f, dy2 = -0.67f, dx3 = 2.75f, dy3 = -2.75f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.08f, dx2 = -0.67f, dy2 = -2.75f, dx3 = -2.75f, dy3 = -2.75f)
                close()
                moveToRelative(dx = -2.49f, dy = -3.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.26f, y1 = 4.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.76f, y1 = 1.59f, x2 = 8.76f, y2 = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = 3.99f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 4.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 1.59f, x2 = 12.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.75f)
                moveToRelative(dx = 4.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 4.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.75f, y1 = 1.59f, x2 = 16.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 4.75f)
                moveToRelative(dx = 6.0f, dy = 4.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 19.59f, y1 = 7.25f, x2 = 20.0f, y2 = 7.25f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = -6.0f, dy = 6.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 22.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 22.75f)
                moveToRelative(dx = -3.99f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.26f, y1 = 22.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -4.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.26f, y1 = 22.0f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.76f, y1 = 19.59f, x2 = 8.76f, y2 = 20.0f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveTo(x = 4.0f, y = 8.75f)
                horizontalLineTo(x = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 11.25f, x2 = 2.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 15.25f, x2 = 2.0f, y2 = 15.25f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.05f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -1.12f)
                lineToRelative(dx = 0.68f, dy = -1.18f)
                horizontalLineToRelative(dx = -0.59f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = -0.57f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.04f, dy1 = -1.22f)
                lineToRelative(dx = 0.94f, dy = -1.64f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.02f, dy1 = -0.28f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.28f, dy1 = 1.02f)
                lineToRelative(dx = -0.68f, dy = 1.18f)
                horizontalLineToRelative(dx = 0.59f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = 0.57f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.04f, dy1 = 1.22f)
                lineToRelative(dx = -0.94f, dy = 1.64f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 15.05f)
            }
        }.build().also { _cpuCharge = it }
    }

@Suppress("ObjectPropertyName")
private var _cpuCharge: ImageVector? = null
