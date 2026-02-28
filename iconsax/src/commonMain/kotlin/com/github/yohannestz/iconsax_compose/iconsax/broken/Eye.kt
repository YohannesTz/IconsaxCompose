package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eye: ImageVector
    get() {
        val current = _eye
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eye",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.03f, y = 14.0f)
                arcTo(horizontalEllipseRadius = 3.58f, verticalEllipseRadius = 3.58f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.0f, y1 = 15.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.56f, y = 5.58f)
                arcTo(horizontalEllipseRadius = 9.6f, verticalEllipseRadius = 9.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 3.73f)
                curveToRelative(dx1 = -3.53f, dy1 = 0.0f, dx2 = -6.82f, dy2 = 2.08f, dx3 = -9.11f, dy3 = 5.68f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.19f)
                curveToRelative(dx1 = 2.29f, dy1 = 3.6f, dx2 = 5.58f, dy2 = 5.68f, dx3 = 9.11f, dy3 = 5.68f)
                reflectiveCurveToRelative(dx1 = 6.82f, dy1 = -2.08f, dx2 = 9.11f, dy2 = -5.68f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.19f)
            }
        }.build().also { _eye = it }
    }

@Suppress("ObjectPropertyName")
private var _eye: ImageVector? = null
