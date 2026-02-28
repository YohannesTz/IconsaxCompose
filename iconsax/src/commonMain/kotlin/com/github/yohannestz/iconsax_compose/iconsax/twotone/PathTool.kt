package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PathTool: ImageVector
    get() {
        val current = _pathTool
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PathTool",
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
                moveTo(x = 19.79f, y = 7.27f)
                lineToRelative(dx = -3.03f, dy = -3.03f)
                curveToRelative(dx1 = -1.15f, dy1 = -1.15f, dx2 = -2.72f, dy2 = -1.1f, dx3 = -3.49f, dy3 = 0.14f)
                lineToRelative(dx = -1.69f, dy = 2.67f)
                lineToRelative(dx = 5.4f, dy = 5.4f)
                lineToRelative(dx = 2.67f, dy = -1.7f)
                curveToRelative(dx1 = 1.15f, dy1 = -0.72f, dx2 = 1.22f, dy2 = -2.4f, dx3 = 0.14f, dy3 = -3.48f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.58f, y = 7.05f)
                lineTo(x = 7.65f, y = 6.81f)
                curveToRelative(dx1 = -2.19f, dy1 = -0.13f, dx2 = -2.96f, dy2 = 0.54f, dx3 = -3.2f, dy3 = 2.63f)
                lineToRelative(dx = -0.98f, dy = 8.32f)
                curveToRelative(dx1 = -0.21f, dy1 = 1.75f, dx2 = 1.06f, dy2 = 3.01f, dx3 = 2.8f, dy3 = 2.8f)
                lineToRelative(dx = 8.32f, dy = -0.98f)
                curveToRelative(dx1 = 2.09f, dy1 = -0.25f, dx2 = 2.85f, dy2 = -1.0f, dx3 = 2.63f, dy3 = -3.2f)
                lineToRelative(dx = -0.23f, dy = -3.93f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.61f, y = 19.42f)
                lineToRelative(dx = 3.03f, dy = -3.04f)
            }
        }.build().also { _pathTool = it }
    }

@Suppress("ObjectPropertyName")
private var _pathTool: ImageVector? = null
