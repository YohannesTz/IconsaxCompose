package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KyberNetwork: ImageVector
    get() {
        val current = _kyberNetwork
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.KyberNetwork",
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
                moveTo(x = 11.01f, y = 2.57f)
                lineToRelative(dx = -5.0f, dy = 2.86f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.0f, y1 = 7.17f)
                verticalLineToRelative(dy = 8.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.84f, dy1 = 1.63f)
                lineToRelative(dx = 5.0f, dy = 3.57f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.32f, dy1 = 0.0f)
                lineToRelative(dx = 5.0f, dy = -3.57f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 19.0f, y1 = 15.98f)
                verticalLineToRelative(dy = -8.8f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.01f, dy1 = -1.75f)
                lineToRelative(dx = -5.0f, dy = -2.86f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.98f, dy1 = 0.0f)
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
                moveTo(x = 12.0f, y = 3.0f)
                lineToRelative(dx = -2.0f, dy = 9.0f)
                lineToRelative(dx = 1.85f, dy = 9.23f)
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
                moveTo(x = 18.16f, y = 16.91f)
                lineTo(x = 10.0f, y = 12.01f)
                lineToRelative(dx = 8.54f, dy = -4.75f)
            }
        }.build().also { _kyberNetwork = it }
    }

@Suppress("ObjectPropertyName")
private var _kyberNetwork: ImageVector? = null
