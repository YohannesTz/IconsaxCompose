package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterEdit: ImageVector
    get() {
        val current = _filterEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FilterEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.41f, y = 20.79f)
                lineTo(x = 12.0f, y = 21.7f)
                curveToRelative(dx1 = -1.31f, dy1 = 0.81f, dx2 = -3.13f, dy2 = -0.1f, dx3 = -3.13f, dy3 = -1.72f)
                verticalLineToRelative(dy = -5.35f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.71f, dx2 = -0.4f, dy2 = -1.62f, dx3 = -0.81f, dy3 = -2.12f)
                lineTo(x = 4.22f, y = 8.47f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.91f, dy1 = -2.02f)
                verticalLineTo(y = 4.13f)
                arcToRelative(a = 2.05f, b = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.02f, dy1 = -2.12f)
                horizontalLineToRelative(dx = 13.34f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.02f, dy1 = 2.02f)
                verticalLineToRelative(dy = 2.22f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 2.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.08f, y = 11.89f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.3f, dy1 = 0.59f)
                lineToRelative(dx = -0.19f, dy = 1.35f)
                curveToRelative(dx1 = -0.07f, dy1 = 0.49f, dx2 = 0.27f, dy2 = 0.83f, dx3 = 0.76f, dy3 = 0.76f)
                lineToRelative(dx = 1.35f, dy = -0.19f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.59f, dy1 = -0.3f)
                lineToRelative(dx = 3.54f, dy = -3.54f)
                curveToRelative(dx1 = 0.61f, dy1 = -0.61f, dx2 = 0.9f, dy2 = -1.32f, dx3 = 0.0f, dy3 = -2.22f)
                curveToRelative(dx1 = -0.89f, dy1 = -0.89f, dx2 = -1.6f, dy2 = -0.6f, dx3 = -2.21f, dy3 = 0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.58f, y = 12.39f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.22f, dy1 = 2.22f)
            }
        }.build().also { _filterEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _filterEdit: ImageVector? = null
