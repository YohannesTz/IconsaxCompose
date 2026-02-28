package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Xrp: ImageVector
    get() {
        val current = _xrp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Xrp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.46f, y = 2.0f)
                horizontalLineTo(x = 4.05f)
                arcToRelative(a = 1.05f, b = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = 1.79f)
                lineToRelative(dx = 5.73f, dy = 5.73f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.93f, dy1 = 0.0f)
                lineToRelative(dx = 5.73f, dy = -5.73f)
                arcTo(horizontalEllipseRadius = 1.05f, verticalEllipseRadius = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 19.96f, y1 = 2.0f)
                horizontalLineToRelative(dx = -1.41f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.22f, dy1 = 0.92f)
                lineTo(x = 12.75f, y = 6.5f)
                arcToRelative(a = 1.04f, b = 1.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.48f, dy1 = 0.0f)
                lineTo(x = 7.69f, y = 2.92f)
                arcTo(horizontalEllipseRadius = 3.2f, verticalEllipseRadius = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.46f, y1 = 2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.46f, y = 21.97f)
                horizontalLineTo(x = 4.05f)
                arcToRelative(a = 1.05f, b = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -1.8f)
                lineToRelative(dx = 5.73f, dy = -5.72f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.93f, dy1 = 0.0f)
                lineToRelative(dx = 5.73f, dy = 5.73f)
                arcToRelative(a = 1.05f, b = 1.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = 1.79f)
                horizontalLineToRelative(dx = -1.41f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.22f, dy1 = -0.92f)
                lineToRelative(dx = -3.58f, dy = -3.58f)
                arcToRelative(a = 1.04f, b = 1.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.48f, dy1 = 0.0f)
                lineToRelative(dx = -3.58f, dy = 3.58f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.23f, dy1 = 0.92f)
            }
        }.build().also { _xrp = it }
    }

@Suppress("ObjectPropertyName")
private var _xrp: ImageVector? = null
