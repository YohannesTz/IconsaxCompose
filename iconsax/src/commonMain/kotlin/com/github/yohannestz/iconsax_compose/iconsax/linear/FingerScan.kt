package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FingerScan: ImageVector
    get() {
        val current = _fingerScan
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FingerScan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 14.88f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.65f, dy1 = -1.65f)
                verticalLineToRelative(dy = -2.47f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.3f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.47f)
                arcTo(horizontalEllipseRadius = 1.65f, verticalEllipseRadius = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.88f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.98f, y = 13.47f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 13.07f)
                verticalLineToRelative(dy = -2.14f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.97f, dy1 = -0.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.0f, y = 2.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 2.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 2.0f)
                moveTo(x = 2.0f, y = 9.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = 6.0f, dy = 20.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -2.0f)
                moveTo(x = 2.0f, y = 15.0f)
                verticalLineToRelative(dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _fingerScan = it }
    }

@Suppress("ObjectPropertyName")
private var _fingerScan: ImageVector? = null
